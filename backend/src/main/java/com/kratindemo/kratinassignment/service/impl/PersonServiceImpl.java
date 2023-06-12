package com.kratindemo.kratinassignment.service.impl;

import com.kratindemo.kratinassignment.model.Health;
import com.kratindemo.kratinassignment.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService{
    List<Person> personList=new ArrayList<>();

    public PersonServiceImpl() {
        Person person = new Person();
        person.setPersonId(1);
        person.setAge(30);
        person.setName("Rocky");
        Health health = new Health();
        health.setBp("102");
        health.setHeight("174 CM");
        health.setWeight("60 KG");
        person.setHealth(health);
        personList.add(person);
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public Person get(Integer personId) {
        return personList.stream().filter(p ->p.getPersonId() == personId).collect(Collectors.toList()).get(0);
    }

    @Override
    public void add(Person person) {
       personList.add(person);
    }

    @Override
    public void delete(Integer personId) {
        Person person = personList.stream().filter(p ->p.getPersonId() == personId).collect(Collectors.toList()).get(0);
        personList.remove(person);
    }
}
