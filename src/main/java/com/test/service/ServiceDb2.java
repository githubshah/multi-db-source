package com.test.service;

import com.test.db2.entity.Animal;
import com.test.db2.repo.AnimalRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDb2 {
    @Autowired
    private AnimalRepo animalRepo;

    @PostConstruct
    void updateDb2() {
        Animal aminal1 = animalRepo.save(new Animal(1L, "aminal1"));
        System.out.println(aminal1.getName());
    }
}
