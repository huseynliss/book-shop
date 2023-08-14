package com.bookStore.bookstore.model;

import com.bookStore.bookstore.dao.entity.Author;
import com.bookStore.bookstore.dao.entity.Genre;
import com.bookStore.bookstore.dao.entity.Language;
import com.bookStore.bookstore.dao.entity.Publisher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {

    private Long id;
    private boolean isActive = true;
    private String title;
    private AuthorDTO authorDTO;
    private String isbn;
    private PublisherDTO publisherDTO;
    private List<GenreDTO> genreDTOS = new ArrayList<>();
    private String description;
    private Double price;
    private Integer quantity;
    private LanguageDTO languageDTO;
    private String coverImage;
    private Double rating;
    private Integer numberOfPages;
    private String publicationFormat;
    private Double discountPercent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publicationDate;


}





