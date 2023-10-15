package com.study.library.controller;

import com.study.library.entity.Book;
import com.study.library.serivce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @PostMapping("/book/insert")
    public String InsertBook(Book book){

        System.out.println("AAA : " + book.getBookSerial());

        bookService.InsertBook(book);

        return "index";
    }

}
