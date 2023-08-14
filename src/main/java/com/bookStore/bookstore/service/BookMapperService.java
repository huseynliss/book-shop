//package com.bookStore.bookstore.service;
//
//import com.bookStore.bookstore.dao.entity.Book;
//import com.bookStore.bookstore.model.BookDTO;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class BookMapperService {
//
//    private final ModelMapper modelMapper;
//
//    public BookMapperService(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }
//
//    public BookDTO convertToDto(Book book) {
//        return modelMapper.map(book, BookDTO.class);
//    }
//
//    public Book convertToEntity(BookDTO bookDTO) {
//        return modelMapper.map(bookDTO, Book.class);
//    }
//}
