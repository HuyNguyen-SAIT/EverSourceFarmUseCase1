package com.example.usecase1.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
    @RequestMapping
    public String login(ModelMap model)
    {
        model.addAttribute("title","Login");
        model.addAttribute("body1","Hello");
        return "login";
    }
}
