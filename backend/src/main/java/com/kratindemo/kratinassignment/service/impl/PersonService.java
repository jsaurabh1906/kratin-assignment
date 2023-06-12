package com.kratindemo.kratinassignment.service.impl;

import com.kratindemo.kratinassignment.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAll();

    Person get(Integer persionId);

    void add(Person person);

    void delete(Integer personId);


}
