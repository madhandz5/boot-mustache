package com.ryan.toyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("username", "Ryan");
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("hi","hi");
        return "login";
    }
}
