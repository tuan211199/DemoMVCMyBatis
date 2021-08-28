package com.demo.service;

import com.demo.entity.Person;
import com.demo.model.SearchModel;
import com.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getPerson(SearchModel model) {
        List<Person> list = personRepository.getPerson(model);
        return list;
    }

    @Override
    public Person getPersonById(int id) {
        return personRepository.getPersonById(id);
    }


    @Override
    public Person addPerson(Person person) {
        return personRepository.addPerson(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.updatePerson(person);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }
}
