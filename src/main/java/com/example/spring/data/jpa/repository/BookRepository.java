package com.example.spring.data.jpa.repository;

import com.example.spring.data.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
