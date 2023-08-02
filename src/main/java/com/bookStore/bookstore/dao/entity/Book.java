package com.bookStore.bookstore.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @Column(nullable = false)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name = "book_genre",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    private String coverImage;

    @Column(nullable = false)
    private double rating;

    @Column(nullable = false)
    private int numberOfPages;

    @Column(nullable = false)
    private String publicationFormat;

    @Column(nullable = false)
    private double discountPercent;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date publicationDate;

    // Constructors, getters, and setters

    // Other constructors

    // Getters and setters for all fields

    // Additional methods as needed
}
