package com.serastudio.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serastudio.event.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
