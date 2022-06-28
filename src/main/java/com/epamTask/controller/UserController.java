package com.epamTask.controller;

import com.epamTask.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public ModelAndView homePage(ModelAndView model, @RequestParam(defaultValue = "User") String name) {
        model.addObject("name", name);
        model.setViewName("user_home");
        return model;
    }

}
