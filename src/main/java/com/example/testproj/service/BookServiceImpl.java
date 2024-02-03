package com.example.testproj.service;

import com.example.testproj.model.Book;
import com.example.testproj.repository.BookRepository;
import com.example.testproj.service.interfaces.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book deleteByID(Long id) {
        Book bookTemp = findByID(id);
        bookRepository.deleteById(id);
        return bookTemp;
    }

    @Override
    public Book findByID(Long id) {
        return bookRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
