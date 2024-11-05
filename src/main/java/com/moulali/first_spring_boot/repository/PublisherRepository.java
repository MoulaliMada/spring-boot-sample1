package com.moulali.first_spring_boot.repository;

import org.springframework.stereotype.Repository;

import com.moulali.first_spring_boot.model.Publisher;

import java.util.ArrayList;

@Repository
public interface PublisherRepository {

    ArrayList<Publisher> getPublishers();

    Publisher getPublisherById(Integer publisherId);

    Publisher addPublisher(Publisher publisher);

    Publisher updatePublisher(int publisherId, Publisher publisher);

    void deletePublisher(int publisherId);
}
