package com.serastudio.organization.model;

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
public class Organization {

    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String email;

    public Organization(String name, String email) {
        this.name = name;
        this.email = email;
    }
}