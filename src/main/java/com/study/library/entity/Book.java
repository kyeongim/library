package com.study.library.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="TB_BOOK")
public class Book {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookSerial;

    private String isbn;

    private String bookTitle;


}
