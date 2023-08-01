package com.bookStore.bookstore.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private String genre;
    private String description;
    private double price;
    private int quantity;
    private String language;
    private String coverImage;
    private double rating;
    private int numberOfPages;
    private String publicationFormat;
    private double discountPercent;

    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    // Constructors, getters, and setters

    public Book() {
        // Default constructor
    }

    // Other constructors

    // Getters and setters for all fields

    // Additional methods as needed
}
