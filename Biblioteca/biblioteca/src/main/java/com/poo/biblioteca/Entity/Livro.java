package com.poo.biblioteca.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 300)
    @Column(name = "nome_do_livro", nullable = false, length = 300)
    private String nomeDoLivro;

    @Size(max = 100)
    @Column(name = "genero", nullable = false, length = 100)
    private String genero;

    @Size(max = 100)
    @Column(name = "autor", nullable = false, length = 100)
    private String autor;

    @Lob
    @Size(max = 2000)
    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Size(max = 300)
    @Column(name = "url_capa", nullable = false, length = 300)
    private String urlCapa;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    public Livro() {}

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeDoLivro() { return nomeDoLivro; }
    public void setNomeDoLivro(String nomeDoLivro) { this.nomeDoLivro = nomeDoLivro; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getUrlCapa() { return urlCapa; }
    public void setUrlCapa(String urlCapa) { this.urlCapa = urlCapa; }

    public LocalDate getDataPublicacao() { return dataPublicacao; }
    public void setDataPublicacao(LocalDate dataPublicacao) { this.dataPublicacao = dataPublicacao; }
}
