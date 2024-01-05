package com.example.testproj.service;

import java.util.List;


public interface BaseService<T> {
    T add(T t);
    T deleteByID(Long id);
    T findByID(Long id);
    List<T> getAll();
}
