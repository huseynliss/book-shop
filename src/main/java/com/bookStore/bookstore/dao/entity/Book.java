package com.bookStore.bookstore.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;
import java.util.Date;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private List<Genre> genres = new ArrayList<>();

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @Column(name = "cover_image", nullable = false)
    private String coverImage;


    @Column(name = "rating", nullable = false)
    private Double rating;

    @Column(name = "number_of_pages", nullable = false)
    private Integer numberOfPages;

    @Column(name = "publication_format", nullable = false)
    private String publicationFormat;

    @Column(name = "discount_percent", nullable = false)
    private Double discountPercent;

    @Column(name = "publication_date", nullable = false)
    private LocalDate  publicationDate;

}





