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


        if (peopleRepositories.findById(id).isPresent()) {
            return peopleRepositories.findById(id).get();
        }
        return People.builder()
                .firstName("I")
                .secondName("was")
                .lastName("born")
                .fullName("I was born")
                .build();
    }
    @Override
    public List<People> getAll() {
        return peopleRepositories.findAll();
    }

}
