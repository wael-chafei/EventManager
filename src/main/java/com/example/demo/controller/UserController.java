package com.example.demo.controller;
import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;


@RestController
public class UserController {
	@Autowired
	UserRepo repo ; 
	
	@PostMapping("add")
	
	   public ResponseEntity<User> postBody(@RequestBody User user) {
		   User persistedUser = repo.save(user);
	        return ResponseEntity
	            .created(URI
	                     .create(String.format("/persons/%s", user.getNom())))
	            .body(persistedUser);
	    }
	
	@RequestMapping(value = "/user/{id}")
	public Optional<User> findUserByid(@PathVariable int id) {
		Optional<User> getted_user ; 
		getted_user = repo.findById(id);
		return getted_user;
	}
	
	@DeleteMapping("/users/{id}")  
	public void deleteUser(@PathVariable int id)  
	{  
		repo.deleteById(id);  
	}

	@GetMapping("events")  
	public List<Event> getEvents()   
	{  
		//finds all the products  
		return eventrepo.findAll(); 	
	} 
	
}
