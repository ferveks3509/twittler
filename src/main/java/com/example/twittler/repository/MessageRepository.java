package com.example.twittler.repository;

import com.example.twittler.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
