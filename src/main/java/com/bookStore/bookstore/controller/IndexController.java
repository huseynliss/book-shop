package com.bookStore.bookstore.controller;

import com.bookStore.bookstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/indexPage")
public class IndexController {


    private BookService bookService;

    public IndexController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public String showIndexPage(){


        return "index";
    }

    @GetMapping("/bookList")
    public String bookListPage(Model model){

    model.addAttribute("AllActiveBooks",bookService.getAllActiveBooks() );

        return "book-list";
    }

    @GetMapping("/header")
    public String header(Model model){



        return "header";
    }

//    @GetMapping
//    @ResponseBody
//    public String sayHello() {
//        return "Merhaba, Dünya!";
//    }


    }