package com.serastudio.news.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serastudio.news.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

}
