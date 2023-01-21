package com.tpe.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Endpoint: http://127.0.0.1:8080/books
@RequestMapping("/books")
public class BooksController {

    @GetMapping("/hi")
    public ModelAndView sayHi(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message","Hello");
        mav.addObject("messagebody","I am a virtual library service");
        mav.setViewName("hi");
        return mav;
    }

}
