package com.bookStore.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenreDTO {

    private Long id;
    private String name;
    private List<BookDTO> bookDTOS = new ArrayList<>();

    // getters and setters

}

