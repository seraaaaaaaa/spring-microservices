package com.serastudio.news.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serastudio.news.config.RabbitMQConfig;
import com.serastudio.news.model.News;
import com.serastudio.news.repo.NewsRepository;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private NewsRepository newsRepository;

    public List<News> findAll() {

        return newsRepository.findAll();
    }

    public News findById(Long id) {

        return newsRepository.findById(id).orElse(null);
    }

    public News create(String title, String content) {
        News news = new News(title, content);
        return newsRepository.save(news);
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void listen(String message) {
        create("New Event", message);
    }

    public boolean delete(Long id) {
        newsRepository.deleteById(id);
        return true;
    }

}