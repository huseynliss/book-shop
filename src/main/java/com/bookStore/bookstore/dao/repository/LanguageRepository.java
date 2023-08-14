package com.bookStore.bookstore.dao.repository;

import com.bookStore.bookstore.dao.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
