package com.example.testproj.service;

import com.example.testproj.model.People;
import com.example.testproj.repository.PeopleRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.ObjectUtils.isEmpty;


@Service
@Log4j2
@NoArgsConstructor
@Data
public class PeopleServiceImp implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepositories;


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
