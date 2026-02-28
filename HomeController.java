package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import com.biblioteca.model.Usuario;
import com.biblioteca.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final BookService service;

    public HomeController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("livros", service.getLivros());
        model.addAttribute("usuarios", service.getUsuarios());
        return "index";
    }
}
