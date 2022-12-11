package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long>{
User findByUsernameAndPassword(String username, String password);
 
}
