package com.example.usecase1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    public String login(ModelMap model)
    {
        model.addAttribute("title","Login");
        model.addAttribute("body1","Hello");
        return "login";
    }
}
