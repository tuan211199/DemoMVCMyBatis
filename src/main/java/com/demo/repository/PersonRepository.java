package com.demo.repository;

import com.demo.entity.Person;
import com.demo.model.SearchModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository {

    Person addPerson(Person person);
    Person updatePerson(Person person);
    int deletePerson(int id);
    List<Person> getPerson(SearchModel model);
    Person getPersonById(int id);
}
