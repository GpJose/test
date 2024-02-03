package com.example.testproj.service;

import com.example.testproj.model.Library;
import com.example.testproj.repository.LibraryRepository;
import com.example.testproj.service.interfaces.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public Library add(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library deleteByID(Long id) {
        Library libraryTemp = findByID(id);
        libraryRepository.deleteById(id);
        return libraryTemp;
    }

    @Override
    public Library findByID(Long id) {
        return libraryRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public List<Library> getAll() {
        return libraryRepository.findAll();
    }
}
