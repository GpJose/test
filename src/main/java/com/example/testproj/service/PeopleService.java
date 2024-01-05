package com.example.testproj.service;
import com.example.testproj.model.People;
import java.util.List;


public interface PeopleService {
    People add(People people);
    People deleteByID(Long id);
    People findByID(Long id);
    List<People> getAll();
}
