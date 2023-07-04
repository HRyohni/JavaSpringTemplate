package hr.istratech.demo.repository;

import hr.istratech.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { // extendamo drugi repo

    List<Person> findAllByImeIgnoreCase (final  String name); // slazemo ime i on odradi sve za nas
                                                              // After znaci '>'
    void deleteById (long id);

}
