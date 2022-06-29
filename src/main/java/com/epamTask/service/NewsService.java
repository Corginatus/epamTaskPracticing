package com.epamTask.service;

import com.epamTask.entity.News;
import com.epamTask.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {
    @Autowired
    private final NewsRepository newsRepository;

    public void saveNews(String title, String date, String brief, String content) {
        News news = new News();
        news.setTitle(title);
        news.setDate(date);
        news.setBrief(brief);
        news.setContent(content);
        newsRepository.save(news);
    }

    public void update(String title, String date, String brief, String content, Long news_id) {
        News news = newsRepository.findNewsById(news_id);
        news.setTitle(title);
        news.setDate(date);
        news.setBrief(brief);
        news.setContent(content);
        newsRepository.save(news);
    }

    public List<News> getAll() {
        return newsRepository.findAll();
    }

    public News getById(Long newsId) {
        return newsRepository.findNewsById(newsId);
    }

    public boolean deleteById(Long id) {
        if (id != null) {
            newsRepository.delete(newsRepository.findNewsById(id));
            return true;
        }
        return false;
    }
}
