package com.example.testproj.service.interfaces;

import com.example.testproj.model.Book;
import com.example.testproj.model.Store;
import com.example.testproj.model.User;

import java.util.List;

public interface StoreService  {
    Store addToCart (Book bookID, User userId);
    void deleteFromCart(Book bookID, User userId);
    List<Store> getAll(User userID);
    Long getPriceForBooks(User userID);
    void payById(Book bookID, User userID);
    void getAllBook(User userID);
}

