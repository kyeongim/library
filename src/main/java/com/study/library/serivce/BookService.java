package com.study.library.serivce;

import com.study.library.entity.Book;
import com.study.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void InsertBook(Book book){

        bookRepository.save(book);
    }

}
