package com.serastudio.news.model;

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
public class News {

    @GeneratedValue
    @Id
    private long id;
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }
}