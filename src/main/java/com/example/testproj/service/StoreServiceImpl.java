package com.example.testproj.service;

import com.example.testproj.model.Book;
import com.example.testproj.model.Store;
import com.example.testproj.model.User;
import com.example.testproj.repository.*;
import com.example.testproj.service.interfaces.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    ChapterRepository chapterRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    LibraryRepository libraryRepository;
    @Autowired
    StoreRepository storeRepository;

    @Override
    public Store addToCart(Book bookID, User userId) {
        return storeRepository.save(Store.builder()
                        .bookId(bookID)
                        .userId(userId)
                        .payed(false)
                .build());
    }

    @Override
    public void deleteFromCart(Book bookID, User userId) {
        storeRepository.deleteByBookIdAndUserId(bookID, userId);
    }

    @Override
    public List<Store> getAll(User userID) {
        return storeRepository.getAllByUserId(userID);
    }

    @Override
    public Long getPriceForBooks(User userID) {
        List<Book> books = bookRepository.getAllBookPrice(userID);
        Long sum =0L;
        for (Book book: books ) {
            sum += book.getPrice();
        }
        return sum;
    }

    @Override
    public void payById(Book bookID, User userID) {

    }

    @Override
    public void getAllBook(User userID) {

    }
}
