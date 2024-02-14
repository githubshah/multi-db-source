package com.test.service;

import com.test.db1.entity.Person;
import com.test.db1.repo.PersonRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDb1 {
    @Autowired
    private PersonRepo personRepo;

    @PostConstruct
    void updateDb1() {
        Person name1 = personRepo.save(new Person(1L, "name1"));
        System.out.println(name1.getName());
    }
}
