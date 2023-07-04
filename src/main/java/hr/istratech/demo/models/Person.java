package hr.istratech.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name = "M_Person" )
public class Person {
    @Id // koji ce biti primarni kljuc
    @GeneratedValue // generiraj automatski novi kljuc
    private Long id;
    // @Column(name = "asdasd") mozemo dodati collumn
    private String ime;
    private String prezime;

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}
