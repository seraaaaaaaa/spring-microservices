package com.serastudio.news.service;

import java.util.List;

import com.serastudio.news.model.News;

public interface NewsService {

    List<News> findAll();

    News findById(Long id);

    News create(String title, String content);

    boolean delete(Long id);

}
