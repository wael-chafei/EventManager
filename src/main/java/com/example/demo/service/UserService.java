package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepository;
    public List<User> listAllUser() {
        return userRepository.findAll();
    }
    
    
    
}
