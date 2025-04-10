package com.serastudio.event.service;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serastudio.event.config.RabbitMQConfig;
import com.serastudio.event.model.Event;
import com.serastudio.event.model.Organization;
import com.serastudio.event.repo.EventRepository;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private OrganizationServiceClient organizationServiceClient;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public List<Event> findAll() {

        return eventRepository.findAll();
    }

    public Event findById(Long id) {

        return eventRepository.findById(id).orElse(null);
    }

    public Event create(Event event) {
        Organization organization = organizationServiceClient.getOrganizationById(event.getOrganizationId());

        if (organization != null) {
            eventRepository.save(event);

            String message = organization.getName() + " will hold " + event.getName() + " at " + event.getLocation();
            rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, message);

            return event;
        }

        return null;

    }

    public boolean delete(Long id) {
        eventRepository.deleteById(id);
        return true;
    }

}