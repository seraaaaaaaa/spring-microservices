package com.serastudio.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.serastudio.news.model.News;
import com.serastudio.news.service.NewsServiceImpl;

@Controller
public class NewsController {

    @Autowired
    private NewsServiceImpl newsService;

    @QueryMapping
    public List<News> findAllNews() {
        return newsService.findAll();
    }

    @QueryMapping
    public News findNewsById(@Argument Long id) {
        return newsService.findById(id);
    }

    @MutationMapping
    public News createNews(@Argument String title, @Argument String content) {

        return newsService.create(title, content);
    }

    @MutationMapping
    public boolean deleteNews(@Argument Long id) {
        return newsService.delete(id);
    }

}
