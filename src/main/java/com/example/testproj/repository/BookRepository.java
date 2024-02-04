package com.example.testproj.repository;

import com.example.testproj.model.Book;
import com.example.testproj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Modifying
    @Query(value = "select b from Public.Store s, Public.book b where s.userID = :userID and s.payed = false",nativeQuery = true)
    List<Book> getAllBookPrice(User userID);
}