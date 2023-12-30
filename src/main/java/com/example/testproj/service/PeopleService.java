package com.example.testproj.service;
import com.example.testproj.model.People;



public interface PeopleService {
    void add(People people);
    void deleteByID(Long id);
    String findByID(Long id);
    Iterable<People> getAll();
    void loadData();
}
