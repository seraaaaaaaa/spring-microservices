package com.serastudio.event.service;

import java.util.List;

import com.serastudio.event.model.Event;

public interface EventService {

    List<Event> findAll();

    Event findById(Long id);

    Event create(Event event);

    boolean delete(Long id);

}
