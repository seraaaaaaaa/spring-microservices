package com.serastudio.event.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String location;
    private Double price;
    private long organizationId;

    public Event(String name, String location, Double price, long organizationId) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.organizationId = organizationId;
    }
}