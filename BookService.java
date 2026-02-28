package com.biblioteca.service;

import com.biblioteca.model.Livro;
import com.biblioteca.model.Usuario;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

    @PostConstruct
    public void init() {
        // dados de exemplo
        livros.add(new Livro("Dom Casmurro", 1899, "Romance"));
        livros.add(new Livro("O Alquimista", 1988, "Aventura"));

        usuarios.add(new Usuario("Maria", "maria@example.com", "(11) 99999-0000"));
    }

    public List<Livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }

    public List<Usuario> getUsuarios() {
        return Collections.unmodifiableList(usuarios);
    }

    public void addLivro(Livro l) {
        livros.add(l);
    }

    public void addUsuario(Usuario u) {
        usuarios.add(u);
    }
}
