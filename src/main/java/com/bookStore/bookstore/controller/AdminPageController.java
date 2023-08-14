package com.bookStore.bookstore.controller;

import com.bookStore.bookstore.dao.entity.Book;
import com.bookStore.bookstore.dao.entity.Genre;
import com.bookStore.bookstore.dao.repository.*;
//import com.bookStore.bookstore.model.BookDTO;
import com.bookStore.bookstore.model.BookDTO;
import com.bookStore.bookstore.service.BookService;
import org.springframework.boot.Banner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminPageController {

    private BookService bookService;
    private BookRepository bookRepository;
    private GenreRepository genreRepository;
    private PublisherRepository publisherRepository;
    private LanguageRepository languageRepository;
    private AuthorRepository authorRepository;
    private int showMessage = 0;


    public AdminPageController(BookService bookService, BookRepository bookRepository, GenreRepository genreRepository, PublisherRepository publisherRepository, LanguageRepository languageRepository, AuthorRepository authorRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
        this.publisherRepository = publisherRepository;
        this.languageRepository = languageRepository;
        this.authorRepository = authorRepository;
    }


    @GetMapping({"", "/"})
    public String showAllProducts(Model model, HttpSession session) {
        bookService.getAllActiveBooks();
        bookService.getAllInactiveBooks();
        model.addAttribute("activeBooks", bookService.getAllActiveBooks());
        model.addAttribute("inactiveBooks", bookService.getAllInactiveBooks());

        // Oturum verisini kontrol edin
        Boolean showSuccessMessage = (Boolean) session.getAttribute("showSuccessMessage");
        if (showSuccessMessage != null && showSuccessMessage) {
            session.removeAttribute("showSuccessMessage"); // Mesajı bir kere gösterdik, artık temizleyebiliriz
            model.addAttribute("showSuccessMessage", true); // Thymeleaf tarafında mesajı görüntülemek için model'e ekliyoruz
        }

        Boolean showSuccessMessageAddProduct = (Boolean) session.getAttribute("showSuccessMessageAddProduct");
        if (showSuccessMessageAddProduct != null && showSuccessMessageAddProduct) {
            session.removeAttribute("showSuccessMessageAddProduct"); // Mesajı bir kere gösterdik, artık temizleyebiliriz
            model.addAttribute("showSuccessMessageAddProduct", true); // Thymeleaf tarafında mesajı görüntülemek için model'e ekliyoruz
        }

        return "admin";
    }




//    @GetMapping("/addProduct")
//    public String showAddProductPage(Model model) {
//
//        model.addAttribute("product", new BookDTO());
//
//        return "addProduct";
//    }

//    @PostMapping("/save")
//    public String saveBook(@RequestBody BookDTO bookDTO) {
//        // Save associated entities first
//        bookService.saveBook(bookDTO);
//
//        return "redirect:/admin";
//    }

    @RequestMapping(value = "/deactivate/{id}", method = RequestMethod.POST)
    public String deactivateBook(@PathVariable Long id) {
        bookService.deactivateBookById(id);

        return "redirect:/admin";
    }

    @RequestMapping(value = "/activate/{id}", method = RequestMethod.POST)
    public String activateBook(@PathVariable Long id) {
        bookService.activateBookById(id);

        return "redirect:/admin";
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        Optional<BookDTO> optionalBookDTO = Optional.ofNullable(bookService.findById(id));
        if (optionalBookDTO.isPresent()) {
            model.addAttribute("book", optionalBookDTO.get());
            return "editBook"; // Thymeleaf template name
        } else {
            return "redirect:/"; // Redirect to home or an error page
        }
    }

    @PostMapping("/edit")
    public String editBook(@ModelAttribute BookDTO bookDTO, HttpSession session) {
        bookService.updateBook(bookDTO);
        session.setAttribute("showSuccessMessage", true); // Başarı mesajını göstermek istediğimizi belirtiyoruz

        return "redirect:/admin";
    }




    @GetMapping ("/addProduct")
    public String showAddProductPage(Model model){
        BookDTO bookDTO = new BookDTO();
        model.addAttribute("bookDTO", bookDTO);
        return "addProduct";
    }

    @PostMapping("addProduct")
    public String addProduct(@ModelAttribute BookDTO bookDTO, HttpSession session){
        bookService.saveBook(bookDTO);

        session.setAttribute("showSuccessMessageAddProduct", true);

        return "redirect:/admin";
    }


}
