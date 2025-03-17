package com.example.spring.data.jpa.service;

import com.example.spring.data.jpa.dto.BookDto;
import com.example.spring.data.jpa.entity.Book;
import com.example.spring.data.jpa.mapper.BookMapper;
import com.example.spring.data.jpa.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookDto saveBook(BookDto bookDTO) {
        Book book = bookMapper.mapBookDTOToBook(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.mapBookToBookDTO(savedBook);
    }

    public Optional<BookDto> getBookById(Long id) {
        return bookRepository.findById(id).
                map(bookMapper::mapBookToBookDTO);
    }

    public List<BookDto> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(bookMapper::mapBookToBookDTO)
                .toList();
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
