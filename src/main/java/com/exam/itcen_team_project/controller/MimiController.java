package com.exam.itcen_team_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MimiController {
    @GetMapping("/mimi")
    public @ResponseBody String mimi() {
        return "Hi, Hello!";
    }
    
}
