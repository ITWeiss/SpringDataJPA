package com.example.spring.data.jpa.service;

import com.example.spring.data.jpa.dto.BookDTO;
import com.example.spring.data.jpa.entity.Book;
import com.example.spring.data.jpa.mapper.BookMapper;
import com.example.spring.data.jpa.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.mapBookDTOToBook(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.mapBookToBookDTO(savedBook);
    }

    public Optional<BookDTO> getBookById(Long id) {
        return bookRepository.findById(id).map(bookMapper::mapBookToBookDTO);
    }

    public List<BookDTO> getAllBooks() {
        List<BookDTO> books = new ArrayList<>();
        bookRepository.findAll().forEach(book -> books.add(bookMapper.mapBookToBookDTO(book)));
        return books;
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
