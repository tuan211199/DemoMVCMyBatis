package com.demo.service;

import com.demo.entity.Person;
import com.demo.model.SearchModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    List<Person> getPerson(SearchModel model);
    Person getPersonById(int id);
    Person addPerson(Person person);
    Person updatePerson(Person person);
    void deletePerson(int id);

}
