package com.bookStore.bookstore.service;

import com.bookStore.bookstore.configuration.ModelMapperConfig;
import com.bookStore.bookstore.dao.entity.*;
import com.bookStore.bookstore.dao.repository.*;

import com.bookStore.bookstore.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    private PublisherRepository publisherRepository;
    private LanguageRepository languageRepository;
    private AuthorRepository authorRepository;

    private ModelMapper modelMapper;

// diğer yöntemler


    @Autowired
    public BookService(BookRepository bookRepository, GenreRepository genreRepository, PublisherRepository publisherRepository, LanguageRepository languageRepository, AuthorRepository authorRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
        this.publisherRepository = publisherRepository;
        this.languageRepository = languageRepository;
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    public Book saveBook(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);

        // Save related entities
        languageRepository.save(book.getLanguage());
        authorRepository.save(book.getAuthor());
        publisherRepository.save(book.getPublisher());

        // Convert and set genres with proper relationships
        List<Genre> genres = bookDTO.getGenreDTOS().stream()
                .map(genreDTO -> modelMapper.map(genreDTO, Genre.class)).toList();

        for (Genre genre : genres) {
            genre.getBooks().add(book); // Set the book's relation in Genre
        }

        book.setGenres(genres);


        bookRepository.save(book);

        return book;
    }


//    public List<BookDTO> getAllBooks(){
//
//        List<BookDTO> bookDTOList = bookRepository.findAll().stream().map(book -> {
//            BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
//            // BookDTO içinde AuthorDTO'yu set et
//            bookDTO.setAuthorDTO(modelMapper.map(book.getAuthor(), AuthorDTO.class));
//
//                    bookDTO.setLanguageDTO(modelMapper.map(book.getLanguage(), LanguageDTO.class));
//            bookDTO.setPublisherDTO(modelMapper.map(book.getPublisher(), PublisherDTO.class));
//            bookDTO.setGenreDTOS(book.getGenres().stream().map(genre -> modelMapper.map(genre, GenreDTO.class)).collect(Collectors.toSet()));
//            return bookDTO;
//        }).toList();
//
//
//        return bookDTOList;
//
//    }

    public List<BookDTO> getAllActiveBooks() {

        List<BookDTO> bookDTOList = bookRepository.findByIsActiveTrue().stream().map(book -> {
            BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
            // BookDTO içinde AuthorDTO'yu set et
            bookDTO.setAuthorDTO(modelMapper.map(book.getAuthor(), AuthorDTO.class));
            bookDTO.setLanguageDTO(modelMapper.map(book.getLanguage(), LanguageDTO.class));
            bookDTO.setPublisherDTO(modelMapper.map(book.getPublisher(), PublisherDTO.class));
            bookDTO.setGenreDTOS(book.getGenres().stream().map(genre -> modelMapper.map(genre, GenreDTO.class)).toList());
            return bookDTO;
        }).toList();


        return bookDTOList;

    }

    public List<BookDTO> getAllInactiveBooks() {

        List<BookDTO> bookDTOList = bookRepository.findByIsActiveFalse().stream().map(book -> {
            BookDTO bookDTO = modelMapper.map(book, BookDTO.class);
            // BookDTO içinde AuthorDTO'yu set et
            bookDTO.setAuthorDTO(modelMapper.map(book.getAuthor(), AuthorDTO.class));
            bookDTO.setLanguageDTO(modelMapper.map(book.getLanguage(), LanguageDTO.class));
            bookDTO.setPublisherDTO(modelMapper.map(book.getPublisher(), PublisherDTO.class));
            bookDTO.setGenreDTOS(book.getGenres().stream().map(genre -> modelMapper.map(genre, GenreDTO.class)).toList());
            return bookDTO;
        }).toList();


        return bookDTOList;

    }

    public void deactivateBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setActive(false);
            bookRepository.save(book);
        }
    }

    public void activateBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setActive(true);
            bookRepository.save(book);
        }
    }

    public BookDTO findById(Long id) {
        BookDTO bookDTO = modelMapper.map(bookRepository.findById(id).get(), BookDTO.class);
        bookDTO.setAuthorDTO(modelMapper.map(bookRepository.findById(id).get().getAuthor(), AuthorDTO.class));
        bookDTO.setLanguageDTO(modelMapper.map(bookRepository.findById(id).get().getLanguage(), LanguageDTO.class));
        bookDTO.setPublisherDTO(modelMapper.map(bookRepository.findById(id).get().getPublisher(), PublisherDTO.class));
        bookDTO.setGenreDTOS(bookRepository.findById(id).get().getGenres().stream().map(genre -> modelMapper.map(genre, GenreDTO.class)).toList());
        return bookDTO;
    }

    public void updateBook(BookDTO bookDTO){
        Optional<Book> optionalBook = bookRepository.findById(bookDTO.getId());
        Book updatedBook = modelMapper.map(bookDTO, Book.class);

        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();

            // Update existing book's properties
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setLanguage(updatedBook.getLanguage());
            existingBook.setPublisher(updatedBook.getPublisher());
            existingBook.setIsbn(updatedBook.getIsbn());
            existingBook.setDescription(updatedBook.getDescription());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setQuantity(updatedBook.getQuantity());
            existingBook.setRating(updatedBook.getRating());
            existingBook.setNumberOfPages(updatedBook.getNumberOfPages());
            existingBook.setPublicationFormat(updatedBook.getPublicationFormat());
            existingBook.setDiscountPercent(updatedBook.getDiscountPercent());
            existingBook.setPublicationDate(updatedBook.getPublicationDate());
            existingBook.setCoverImage(updatedBook.getCoverImage());

            // Update genres with proper relationships
            List<Genre> updatedGenres = updatedBook.getGenres().stream()
                    .map(genreDTO -> modelMapper.map(genreDTO, Genre.class)).toList();

            existingBook.getGenres().clear();

            for (Genre updatedGenre : updatedGenres) {
                existingBook.getGenres().add(updatedGenre);
            }

            bookRepository.save(existingBook);
        } else {

        }
    }


}

