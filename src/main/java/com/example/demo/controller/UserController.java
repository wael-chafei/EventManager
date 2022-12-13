package com.example.demo.controller;
import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserRepo repo ; 
	
	@PostMapping
	   public ResponseEntity<User> postBody(@RequestBody User user) {
		   User persistedUser = repo.save(user);
	        return ResponseEntity
	            .created(URI
	                     .create(String.format("/persons/%s", user.getNom())))
	            .body(persistedUser);
	    }
	
	@GetMapping("/{id}")
	public Optional<User> findUserByid(@PathVariable int id) {
		Optional<User> getted_user ; 
		getted_user = repo.findById(id);
		return getted_user;
	}
	


}
