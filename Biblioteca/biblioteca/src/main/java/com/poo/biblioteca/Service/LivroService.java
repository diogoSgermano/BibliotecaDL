package com.poo.biblioteca.Service;

import com.poo.biblioteca.Entity.Livro;
import com.poo.biblioteca.Repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repo;

    public LivroService(LivroRepository repo){
        this.repo = repo;
    }

    public Livro cadastrarLivro(Livro livro) {
        return repo.save(livro);
    }

    public List<Livro> listarTodos() {
        return repo.findAll();
    }

    public List<Livro> findAll() {
        return repo.findAll();
    }
}