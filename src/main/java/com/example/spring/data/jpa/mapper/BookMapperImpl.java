package com.example.spring.data.jpa.mapper;

import com.example.spring.data.jpa.dto.BookDTO;
import com.example.spring.data.jpa.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDTO mapBookToBookDTO(Book book) {
        return new BookDTO(book.getTitle(), book.getAuthor());
    }

    @Override
    public Book mapBookDTOToBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.title());
        book.setAuthor(bookDTO.author());
        return book;
    }
}
