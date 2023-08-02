package com.bookStore.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/indexPage")
public class IndexController {


    @GetMapping
    public String showIndexPage(){


        return "index";
    }

//    @GetMapping
//    @ResponseBody
//    public String sayHello() {
//        return "Merhaba, Dünya!";
//    }


    }