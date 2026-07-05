package com.example.budgettracker.controller;

import com.example.budgettracker.model.Tag;
import com.example.budgettracker.repository.TagRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TagController {

    private final TagRepository tagRepository;

    public TagController(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @GetMapping("/tags")
    public List<Tag> getTags() {
        return tagRepository.findAll();
    }

    @PostMapping("/tags")
    public Tag createTag(@RequestBody Tag tag) {
        return tagRepository.save(tag);
    }
}
