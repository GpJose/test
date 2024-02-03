package com.example.testproj.service;

import com.example.testproj.model.Chapter;
import com.example.testproj.repository.ChapterRepository;
import com.example.testproj.service.interfaces.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    ChapterRepository chapterRepository;

    @Override
    public Chapter add(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    @Override
    public Chapter deleteByID(Long id) {
        Chapter chapterTemp = findByID(id);
        chapterRepository.deleteById(id);
        return chapterTemp;
    }

    @Override
    public Chapter findByID(Long id) {
        return chapterRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public List<Chapter> getAll() {
        return chapterRepository.findAll();
    }
}
