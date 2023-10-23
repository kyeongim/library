package com.study.library.repository;

import com.study.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    // jpaRepository는 interface임 기본적인 CRUD를 제공해줌, @Repository가 내부적으로 붙어있음
    // interface 구현되지 않은 추상 메서드를 갖고있음 -> implements 구현하겠다!



}
