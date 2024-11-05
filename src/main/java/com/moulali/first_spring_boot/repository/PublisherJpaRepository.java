package com.moulali.first_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moulali.first_spring_boot.model.Publisher;

@Repository
public interface PublisherJpaRepository extends JpaRepository<Publisher, Integer> {

}
