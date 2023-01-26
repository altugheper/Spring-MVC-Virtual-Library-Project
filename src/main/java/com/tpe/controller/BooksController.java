package com.tpe.controller;


import com.tpe.domain.Books;
import com.tpe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

@Controller // Endpoint: http://127.0.0.1:8080/books
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/hi")
    public ModelAndView sayHi(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message","Hello");
        mav.addObject("messagebody","I am a virtual library service");
        mav.setViewName("hi");
        return mav;
    }

    @GetMapping("/new")
    public String sendStudentForm(@ModelAttribute("books") Books books){
        return "courseForm";
    }

    @PostMapping("/saveBook")
    public String createBooks(@ModelAttribute Books books){
        bookService.saveBook(books);
        return "redirect:/courses";
    }

    @GetMapping
    public ModelAndView getBooks(){
        List<Books> list = bookService.getAllBooks();
        ModelAndView mav = new ModelAndView();
        mav.addObject("books",list);
        mav.setViewName("courses");
        return mav;
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("id") Long id, Model model){
        Books books = bookService.findBookById(id);
        model.addAttribute(books);
        return "courseForm";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return "redirect:/courses";
    }


}
