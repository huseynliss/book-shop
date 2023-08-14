package com.bookStore.bookstore.dao.repository;

import com.bookStore.bookstore.dao.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
