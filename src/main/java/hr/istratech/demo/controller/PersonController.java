package hr.istratech.demo.controller;

import hr.istratech.demo.models.Person;
import hr.istratech.demo.service.PersonService;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.web.bind.annotation.*;
import hr.istratech.demo.repository.PersonRepository;

import java.util.List;
import java.util.Optional;


@RestController
public class PersonController {

    /**
     * <b>Controller</b>
     * <hr/>
     * <br>
     * - za ulazak u aplikaciju
     * <br>
     * - i ne izvrsava poslovnu logiku
     * <br>
     * <b>Idealan  controller je kada ima samo jednu liniju</b>
     * <br>
     * koristeci <b>Interface</b> <i>PersonServices</i> i <b>Implementaciju</b> <i>PersonServiceImpl</i>
     */

    private PersonService personService; // koristimi interface

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping("person")
    public Person savePerson(@RequestBody final Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("person")
    public List<Person> getAllPersons(@RequestParam(name = "ime", defaultValue = "") final  String ime) {

        return personService.getAllPersonsFilterByName(ime);
    }


    @GetMapping("person/{person_id}")
    public Person getPersonById(@PathVariable("person_id") final Long PersonId) {
        return personService.getPersonById(PersonId);

    }

    @GetMapping("person/del/{person_id}") // ISPRAVNIJE JE KORISTITI DELETE MAPPING
    public void deletePersonById(@PathVariable("person_id") final Long PersonId) {
        personService.deleteUserById(PersonId);

    }

    @DeleteMapping("person/MapDel/{person_id}")
    public  void  deletePersonByIdMapping (@PathVariable("person_id") final Long PersonId)
    {
        this.personService.deleteUserById(PersonId);
    }
    // ne radi bas


}
