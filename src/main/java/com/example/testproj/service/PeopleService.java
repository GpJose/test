package com.example.testproj.service;
import com.example.testproj.model.People;
import java.util.List;



public interface PeopleService {
    void add(People people);
    void deleteByID(Long id);
    String findByID(Long id);
    List<People> getAll();
    void loadData();
}
