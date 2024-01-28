package com.example.testproj.service;

import java.util.List;
import java.util.Optional;


public interface BaseService<T> {
    T add(T t);
    T deleteByID(Long id);
    Optional<T> findByID(Long id);
    List<T> getAll();
}
