package com.study.library.serivce;

import com.study.library.entity.Book;
import com.study.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> ListBook(){
        return bookRepository.findAll();
    }

    public void InsertBook(Book book){

        bookRepository.save(book);
    }

    public void UpdateBook(Book book){
        bookRepository.save(book);
    }

    public void DeleteBook(Book book){
        bookRepository.delete(book);
    }

    public Book DetailBook(Book book){
        return bookRepository.getById(book.getBookSerial());
    }

}
