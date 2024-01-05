package com.example.testproj.service;

import com.example.testproj.model.People;
import com.example.testproj.repository.PeopleRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
@Log4j2
public class PeopleServiceImp implements PeopleService {

    private final PeopleRepository peopleRepositories;

    @Autowired
    public PeopleServiceImp(PeopleRepository peopleRepositories) {
        this.peopleRepositories = peopleRepositories;
    }


    @Override
    public People add(People people) {
           return peopleRepositories.save(people);
    }

    @Override
    public People deleteByID(Long id) {
        People pplTemp = findByID(id);
        log.info("Deleting: " +pplTemp);
        peopleRepositories.deleteById(id);
        log.info("Has been deleted...");
        return pplTemp;
    }

    @Override
    public People findByID(Long id) {
        return peopleRepositories.findById(id).orElse(peopleRepositories.save((
                new People(1L,"First","Second","Last","Full")
        )));
    }
    @Override
    public List<People> getAll() {
        return peopleRepositories.findAll();
    }

}
