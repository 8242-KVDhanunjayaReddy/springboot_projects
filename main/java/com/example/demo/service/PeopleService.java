package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
    public interface PeopleService {
        List<Person> findAllPeople();
        Person findById(long id);
        Person insert(Person p);
        boolean delete(long id);
        boolean update(Person p);
    }

