package com.example.spring.data.jpa.controller;

import com.example.spring.data.jpa.dto.BookDto;
import com.example.spring.data.jpa.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<BookDto> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/books/add")
    public String addForm() {
        return "addBook";
    }

    @PostMapping("/books/add")
    public String addBook(@ModelAttribute("book") BookDto bookDTO) {
        bookService.saveBook(bookDTO);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteBookById(@PathVariable("id") Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }

    @GetMapping("/books/get/{id}")
    @ResponseBody
    public BookDto getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id)
                .orElseThrow(() -> new RuntimeException("Книга с id = %s не найдена".formatted(id)));
    }


}
