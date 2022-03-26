package com.example.twittler.controller;

import com.example.twittler.model.Message;
import com.example.twittler.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/create")
    public String create() {
        return "createMes";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute Message message, Principal principal) {
        message.setAuthor(principal.getName());
        messageService.saveMessage(message);
        return "redirect:/index";
    }

    @PostMapping("/filter")
    public String filter(@RequestParam String tag, Model model) {
        model.addAttribute("messages", messageService.findByTag(tag));
        return "index";
    }
}
