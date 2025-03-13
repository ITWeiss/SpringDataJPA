package com.example.spring.data.jpa.mapper;

import com.example.spring.data.jpa.dto.BookDTO;
import com.example.spring.data.jpa.entity.Book;

public interface BookMapper {

    public BookDTO mapBookToBookDTO(Book book);

    public Book mapBookDTOToBook(BookDTO bookDTO);
}
