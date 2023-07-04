package hr.istratech.demo.service;

import hr.istratech.demo.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons ();
    Person getPersonById (final long passedId);
    Person savePerson (final  Person person);
    List<Person> getAllPersonsFilterByName (final String Name);
    void deleteUserById (long id);
}
