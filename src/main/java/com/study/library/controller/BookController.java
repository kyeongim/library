package com.study.library.controller;

import com.study.library.entity.Book;
import com.study.library.serivce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @PostMapping("/book/update")
    public String UpdateBook(Book book){

        System.out.println("AAA : " + book.getBookSerial());

        bookService.UpdateBook(book);

        return "index";
    }

    @PostMapping("/book/delete")
    public String DeleteBook(Book book){

        System.out.println("AAA : " + book.getBookSerial());

        bookService.DeleteBook(book);

        return "index";
    }

    @PostMapping("/book/select")
    public String ListBook(Model model){

       List<Book> list = bookService.ListBook();

        System.out.println("AAA : " + list.size());

        model.addAttribute("list", list);

        return "index";
    }


    @PostMapping("/book/detail")
    public String DetailBook(Book book, Model model){

        Book detail = bookService.DetailBook(book);

        System.out.println("AAA : " + detail);

        model.addAttribute("book", detail);

        return "index";
    }

}
