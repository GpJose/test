package com.example.testproj.repository;

import com.example.testproj.model.Book;
import com.example.testproj.model.Store;
import com.example.testproj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    void deleteByBookIdAndUserId (Book bookId, User userId);
    List<Store> getAllByUserId(User userId);


}