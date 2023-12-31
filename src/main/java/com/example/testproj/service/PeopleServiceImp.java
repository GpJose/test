package com.example.testproj.service;

import com.example.testproj.model.People;
import com.example.testproj.repository.PeopleRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Log4j2
@NoArgsConstructor
@Data
public class PeopleServiceImp implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepositories;


    @Override
    public void add(People people) {
            peopleRepositories.save(people);
            log.info("Added people: " + people);
    }

    @Override
    public void deleteByID(Long id) {
        log.info("Deleting: " +findByID(id));
        peopleRepositories.deleteById(id);
        log.info("Deleted");
    }

    @Override
    public String findByID(Long id) {
        if (isEmpty(id)) {
            return peopleRepositories.findById(id).toString();
        } else return ("Is empty");
    }
    @Override
    public List<People> getAll() {
        return peopleRepositories.findAll();
    }

    private boolean isEmpty(Long id){
        return peopleRepositories.findById(id).isEmpty();
    }
    @Override
    public void loadData() {
        peopleRepositories.saveAll(List.of(
                new People(1L,"First","Second","Last","Full"),
                new People(3L,"First","Second","Last","Full"),
                new People(2L,"First","Second","Last","Full"),
                new People(4L,"First","Second","Last","Full")
        ));
    }

}
