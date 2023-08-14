package com.bookStore.bookstore.dao.repository;

import com.bookStore.bookstore.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
//    @Query("SELECT b FROM Book b WHERE b.isActive = true")
//    List<Book> findAllActiveBooks();

    List<Book> findByIsActiveTrue();;
    List<Book> findByIsActiveFalse();

}
