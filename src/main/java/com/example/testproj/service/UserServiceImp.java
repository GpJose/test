package com.example.testproj.service;

import com.example.testproj.model.User;
import com.example.testproj.repository.UserRepository;
import com.example.testproj.service.interfaces.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Log4j2
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(User user) {
           return userRepository.save(user);
    }

    @Override
    public User deleteByID(Long id) {
        User pplTemp = findByID(id);
        userRepository.deleteById(id);
        return pplTemp;
    }

    @Override
    public User findByID(Long id) {
        return userRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
