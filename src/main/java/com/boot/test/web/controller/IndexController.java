package com.boot.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("name", "Arif");
        return "home";
    }

    @RequestMapping("/home")
    public ModelAndView homeWelcome() {
        return new ModelAndView("home");
    }
}
