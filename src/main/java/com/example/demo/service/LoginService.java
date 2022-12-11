package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginRepository;
import com.example.demo.entities.User;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
  
  public User login(String username, String password) {
	  User user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
	

}