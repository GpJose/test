package com.example.testproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.testproj.service.PeopleService;
import com.example.testproj.model.People;

import java.util.List;

@RestController
@RequestMapping("/people/api")
public class PeopleController {
    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public ResponseEntity<List<People>> getAllPeople(){
        return ResponseEntity.status(201).body(peopleService.getAll());
    }
    @PutMapping
    public ResponseEntity<People> addPeople (People people){
       return ResponseEntity.status(201).body(peopleService.add(people));
    }
    @DeleteMapping
    public ResponseEntity<People> deletePeople (Long id){
        return ResponseEntity.status(201).body(peopleService.deleteByID(id));
    }
    @PostMapping
    public ResponseEntity<People> findByID(Long id) {
        return ResponseEntity.status(201).body(peopleService.findByID(id));
    }
}
