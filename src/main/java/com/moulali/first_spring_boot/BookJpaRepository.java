package com.moulali.first_spring_boot;

//import com.moulali.first_spring_boot.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {
    
}
