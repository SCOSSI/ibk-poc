package com.example.ibkweb.ibkweb.model.output;

/**
 * Created by gabriel on 13/08/17.
 */
public class LivroOutput {
    private Long id;
    private String nome;
    private String autor;

    public LivroOutput(Long id, String nome, String autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }
}
