package com.poo.biblioteca.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
public class Biblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 255)
    private String nomeDoLivro;

    @Column(nullable = false,length = 50)
    private String genero;

    @Column(nullable = false,length = 100)
    private String autor;

    @Column(nullable = false,length = 100)
    private String descricao;

    @Column(nullable = false,length = 255)
    private String urlCapa;

    @Column(nullable = false,length = 50)
    private LocalDate dataPublicacao;

    public Biblioteca() {
    }

    public Biblioteca(Long id, String nomeDoLivro,
                      String genero, String autor,
                      String descricao, String urlCapa,
                      LocalDate dataPublicacao)
    {
        this.id = id;
        this.nomeDoLivro = nomeDoLivro;
        this.genero = genero;
        this.autor = autor;
        this.descricao = descricao;
        this.urlCapa = urlCapa;
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getUrlCapa() {
        return urlCapa;
    }

    public void setUrlCapa(String urlCapa) {
        this.urlCapa = urlCapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
