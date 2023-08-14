package com.bookStore.bookstore.dao.repository;

import com.bookStore.bookstore.dao.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    boolean existsByName(String name);
}

