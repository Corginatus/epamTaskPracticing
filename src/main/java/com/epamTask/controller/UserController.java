package com.epamTask.controller;

import com.epamTask.entity.News;
import com.epamTask.entity.User;
import com.epamTask.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private NewsService newsService;

    @GetMapping("/news_list")
    public ModelAndView homePage(ModelAndView model) {
        model.addObject("newsList", newsService.getAll());
        model.setViewName("news_list");
        return model;
    }

    @PostMapping("/create_news")
    public String give_job(@RequestParam String title, @RequestParam("date") Date date,
                           @RequestParam String brief, @RequestParam String content) {
        String myDate = String.valueOf(date);
        newsService.saveNews(title, myDate, brief, content);
        return "redirect:/user/news_list";
    }

    @PostMapping("/update")
    public String update(@RequestParam String title, @RequestParam("date") Date date,
                            @RequestParam String brief, @RequestParam String content,
                            @RequestParam(name = "news_id") Long news_id) {
        String myDate = String.valueOf(date);
        newsService.update(title, myDate, brief, content, news_id);
        return "redirect:/user/news_list";
    }

    @GetMapping("/help")
    public ModelAndView help(ModelAndView model){
        model.setViewName("help");
        return model;
    }

    @GetMapping("/add_news")
    public ModelAndView add_news(ModelAndView model) {
        model.setViewName("add_news");
        return model;
    }

    @GetMapping("/view")
    public ModelAndView view(ModelAndView model, @RequestParam Long news_id) {
        News news = newsService.getById(news_id);
        model.addObject("news", news);
        model.setViewName("view");
        return model;
    }

    @GetMapping("/edit")
    public ModelAndView edit(ModelAndView model, @RequestParam Long news_id) {
        News news = newsService.getById(news_id);
        model.addObject("news", news);
        model.setViewName("edit");
        return model;
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(name = "news_id") Long news_id) {
        newsService.deleteById(news_id);
        return "redirect:/user/news_list";
    }

}
