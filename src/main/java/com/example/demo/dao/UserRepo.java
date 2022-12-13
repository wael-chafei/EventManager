package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
   User findUserByUsername(String username);
}
