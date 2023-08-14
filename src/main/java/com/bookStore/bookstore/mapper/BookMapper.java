//package com.bookStore.bookstore.mapper;
//
//import com.bookStore.bookstore.dao.entity.Book;
//import com.bookStore.bookstore.model.BookDTO;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//import org.springframework.web.bind.annotation.Mapping;
//
//@Mapper
//public interface BookMapper {
//
//    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
//
//    @org.mapstruct.Mapping(source = "author.id", target = "authorId")
//    @org.mapstruct.Mapping(source = "publisher.id", target = "publisherId")
//    @org.mapstruct.Mapping(source = "genre", target = "genreId")
//    @org.mapstruct.Mapping(source = "language.id", target = "languageId")
//    BookDTO bookToBookDTO(Book book);
//
//    @org.mapstruct.Mapping(source = "authorId", target = "author.id")
//    @org.mapstruct.Mapping(source = "publisherId", target = "publisher.id")
//    @org.mapstruct.Mapping(source = "genreId", target = "genre")
//    @org.mapstruct.Mapping(source = "languageId", target = "language.id")
//    Book bookDTOToBook(BookDTO bookDTO);
//}
