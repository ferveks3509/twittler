package com.example.twittler.service;

import com.example.twittler.model.Message;
import com.example.twittler.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> findAllMessage() {
        List<Message> rsl = new ArrayList<>();
        messageRepository.findAll().forEach(rsl::add);
        return rsl;
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    public List<Message> findByTag(String tag) {
        List<Message> rsl = new ArrayList<>();
        if (tag != null && !tag.isEmpty()) {
            rsl = messageRepository.findByTag(tag);
        } else {
            messageRepository.findAll().forEach(rsl::add);
        }
        return rsl;
    }
}
