package com.example.ibkweb.ibkweb.model.input;

/**
 * Created by gabriel on 13/08/17.
 */
public class LivroInput {
    private Long id;
    private String nome;
    private String autor;

    public LivroInput(Long id, String nome, String autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
