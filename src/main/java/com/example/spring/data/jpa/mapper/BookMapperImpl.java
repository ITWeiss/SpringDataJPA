package com.example.spring.data.jpa.mapper;

import com.example.spring.data.jpa.dto.BookDto;
import com.example.spring.data.jpa.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto mapBookToBookDTO(Book book) {
        return new BookDto(book.getTitle(), book.getAuthor());
    }

    @Override
    public Book mapBookDTOToBook(BookDto bookDTO) {
        Book book = new Book();
        book.setTitle(bookDTO.title());
        book.setAuthor(bookDTO.author());
        return book;
    }
}
