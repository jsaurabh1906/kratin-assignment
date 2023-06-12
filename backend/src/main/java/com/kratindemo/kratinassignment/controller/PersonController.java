package com.kratindemo.kratinassignment.controller;

import com.kratindemo.kratinassignment.model.Person;
import com.kratindemo.kratinassignment.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
   private PersonServiceImpl personService;
    @GetMapping("/person")
    public List<Person> getAll(){
        return personService.getAll();
    }
    @GetMapping("/person/{id}")
    public Person getById(@PathVariable int id){
      System.out.println("got it");
      return personService.get(id);
    }

    @DeleteMapping("/person/{id}")
    public void deleteById(@PathVariable int id){
        System.out.println("got it");
        personService.delete(id);
    }
}
