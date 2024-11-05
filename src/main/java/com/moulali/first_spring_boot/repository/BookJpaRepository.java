package com.moulali.first_spring_boot.repository;

//import com.moulali.first_spring_boot.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.moulali.first_spring_boot.model.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {
    
}