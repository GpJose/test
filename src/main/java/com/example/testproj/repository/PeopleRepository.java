package com.example.testproj.repository;

import com.example.testproj.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends CrudRepository<People, Long> {
}
