package com.epamTask.repository;

import com.epamTask.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
    News findNewsById(Long id);
}
