package hr.istratech.demo.service.impl;

import hr.istratech.demo.models.Person;
import hr.istratech.demo.repository.PersonRepository;
import hr.istratech.demo.service.PersonService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }


    @Override
    public Person getPersonById( long personId  ) {
        final Optional<Person> person = personRepository.findById(personId);
        return person.get();
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
    @Override
    public void deleteUserById(long id) {
        personRepository.deleteById(id);
    }
    @Override
    public List<Person> getAllPersonsFilterByName(String Name) {

        if (Strings.isBlank(Name) )
            return getAllPersons();

        return personRepository.findAllByImeIgnoreCase( Name );

//        return getAllPersons().stream()
//                .filter( person -> person.getIme().equalsIgnoreCase(Name))
//                .collect(Collectors.toList());

    }



}
