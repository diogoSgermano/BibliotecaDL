// java
package com.poo.biblioteca.Controller;

import com.poo.biblioteca.Entity.Livro;
import com.poo.biblioteca.Service.LivroService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/biblioteca")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/cadastro_de_livros")
    public String novoLivro(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("listaLivros", livroService.findAll());
        return "biblioteca/cadastro_de_livro";
    }

    @PostMapping("/cadastrar_livro")
    public String salvarLivro(@Valid @ModelAttribute("livro") Livro livro,
                              BindingResult bindingResult,
                              Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listaLivros", livroService.findAll());
            return "biblioteca/cadastro_de_livro";
        }
        livroService.cadastrarLivro(livro);
        return "redirect:/biblioteca/cadastro_de_livros";
    }
}
