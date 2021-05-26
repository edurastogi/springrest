package com.learning.springweb.controller;

import com.learning.springweb.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController{

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(12,"Mastering Spring 2.0", "Aditya Rastogi Test 1"));
    }
}
