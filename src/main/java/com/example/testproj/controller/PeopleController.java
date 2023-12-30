package com.example.testproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.testproj.service.PeopleService;
import com.example.testproj.model.People;

@RestController
@RequestMapping("/people/api")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    @ResponseBody
    public Iterable<People> getAllPeople(){
        return peopleService.getAll();
    }
    @PutMapping
    @GetMapping
    public void addPeople (People people){
        peopleService.add(people);
    }
    @DeleteMapping
    public void deletePeople (Long id){
        peopleService.deleteByID(id);
    }
    @PostMapping
    public String findByID(Long id) {
        return peopleService.findByID(id);
    }
    @GetMapping("/load")
    public void load(){
        peopleService.loadData();
    }
}
