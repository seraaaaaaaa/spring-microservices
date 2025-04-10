package com.serastudio.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serastudio.event.model.Event;
import com.serastudio.event.service.EventServiceImpl;

@RestController
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    private EventServiceImpl eventservice;

    @GetMapping("/all")
    public List<Event> findAllEvent() {
        return eventservice.findAll();
    }

    @GetMapping("/get/{id}")
    public Event findEventById(@PathVariable Long id) {
        return eventservice.findById(id);
    }

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) {

        return eventservice.create(event);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEvent(@PathVariable Long id) {
        return eventservice.delete(id);
    }

}
