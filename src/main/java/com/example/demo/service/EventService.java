package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EventRepo;
import com.example.demo.entities.Event;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventService {
    @Autowired
    private EventRepo eventRepository;
    public List<Event> listAllEvent() {
        return eventRepository.findAll();
    }
}
