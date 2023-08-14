package com.bookStore.bookstore.dao.repository;

import com.bookStore.bookstore.dao.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

