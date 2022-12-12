package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EventRepo;
import com.example.demo.entities.Event;
import com.example.demo.service.EventService;


@RestController
public class EventController {
	@Autowired
	EventRepo repo ; 
	@CrossOrigin(origins = "", allowedHeaders = "")
	@PostMapping("addEvent")
	   public ResponseEntity<Event> postBody(@RequestBody Event event) {
		Event persistedUser = repo.save(event);
	        return ResponseEntity
	            .created(URI
	                     .create(String.format("/persons/%s", event.getNom())))
	            .body(persistedUser);
	    }
	
	   @Autowired
	   EventService eventService;

	    @GetMapping("event")
	    public List<Event> list() {
	        return eventService.listAllEvent();
	    }
	
	
}
