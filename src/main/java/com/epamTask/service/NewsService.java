package com.epamTask.service;

import com.epamTask.entity.News;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository newsRepository;

    public void saveNews(String title, String date, String brief, String content) {
        News news = new News();
        news.setTitle(title);
        news.setDate(date);
        news.setBrief(brief);
        news.setContent(content);
        newsRepository.save(news);
    }
}
