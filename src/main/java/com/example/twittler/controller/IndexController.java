package com.example.twittler.controller;

import com.example.twittler.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final MessageService messageService;

    public IndexController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("messages", messageService.findAllMessage());
        return "index";
    }
}
