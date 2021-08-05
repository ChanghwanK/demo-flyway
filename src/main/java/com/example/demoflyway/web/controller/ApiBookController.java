package com.example.demoflyway.web.controller;

import com.example.demoflyway.web.domain.Book;
import com.example.demoflyway.web.domain.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Bloo
 * @Date: 2021/08/04
 */

@Slf4j
@RequiredArgsConstructor
@RestController
public class ApiBookController {


    private final BookRepository bookRepository;

    @PostMapping("/api/books")
    public Book save() {
        Book book = Book.builder()
            .title("제목")
            .content("내용")
            .build();

        return bookRepository.save(book);
    }


}
