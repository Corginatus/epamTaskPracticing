package com.epamTask.controller;

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
    public ModelAndView homePage(ModelAndView model, @RequestParam(defaultValue = "User") String name) {
        model.addObject("name", name);
        model.setViewName("news_list");
        return model;
    }

    @PostMapping("/create_news")
    public String give_job(@RequestParam String title, @RequestParam("date") Date date,
                           @RequestParam String brief, @RequestParam String content) {
//        DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
//        String date = dateFormat.format(datee);
        String myDate = String.valueOf(date);
        newsService.saveNews(title, myDate, brief, content);
        return "redirect:/user/news_list";
    }

    @GetMapping("/help")
    public String help(){
        return "redirect:/user/help";
    }

    @GetMapping("/add_news")
    public ModelAndView edit(ModelAndView model) {
        model.setViewName("add_news");
        return model;
    }

}
