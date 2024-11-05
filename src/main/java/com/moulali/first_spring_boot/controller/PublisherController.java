package com.moulali.first_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.moulali.first_spring_boot.model.Publisher;
import com.moulali.first_spring_boot.service.PublisherJpaService;

import java.util.ArrayList;

@RestController
public class PublisherController {
    @Autowired
    private PublisherJpaService publisherJpaService;

    @GetMapping("/publishers")
    public ArrayList<Publisher> getPublishers() {
        return publisherJpaService.getPublishers();
    }

    @GetMapping("/publishers/{publisherId}")
    public Publisher getPublisherById(@PathVariable Integer publisherId) {
        return publisherJpaService.getPublisherById(publisherId);
    }

    @PostMapping("/publishers")
    public Publisher addPublisher(@RequestBody Publisher publisher) {
        return publisherJpaService.addPublisher(publisher);
    }

    @PutMapping("/publishers/{publisherId}")
    public Publisher updatePublisher(@RequestBody Publisher publisher, @PathVariable("publisherId") int publisherId) {
        return publisherJpaService.updatePublisher(publisherId, publisher);
    }

    @DeleteMapping("/publishers/{publisherId}")
    public void deletePublisher(@PathVariable("publisherId") int publisherId) {
        publisherJpaService.deletePublisher(publisherId);
    }
}