package com.example.testproj.controller;

import com.example.testproj.model.People;
import com.example.testproj.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people/")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public ResponseEntity<List<People>> getAllPeople(){
        return ResponseEntity.status(200).body(peopleService.getAll());
    }
    @PostMapping
    public ResponseEntity<People> addPeople (@RequestBody People people){
       return ResponseEntity.status(201).body(peopleService.add(people));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<People> deletePeople (@PathVariable("id") Long id){
        return ResponseEntity.status(200).body(peopleService.deleteByID(id));
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<People> findByID(@PathVariable("id") Long id) {
        return ResponseEntity.status(200).body(peopleService.findByID(id));
    }
}
