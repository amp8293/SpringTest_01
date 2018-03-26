package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/loadForm")
    public String loadFormTemplate() {
        return "formTemplate";
    }

    @RequestMapping("/processForm")
    public String processTemplate(@RequestParam("login") String login, Model model) {
        model.addAttribute("login", login);
        return "confirm";
    }

}
