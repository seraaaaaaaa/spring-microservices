package com.serastudio.event.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    private long id;
    private String name;
    private String email;

    public Organization(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
