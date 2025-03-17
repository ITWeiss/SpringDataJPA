package com.example.spring.data.jpa.mapper;

import com.example.spring.data.jpa.dto.BookDto;
import com.example.spring.data.jpa.entity.Book;

public interface BookMapper {

    public BookDto mapBookToBookDTO(Book book);

    public Book mapBookDTOToBook(BookDto bookDTO);
}
