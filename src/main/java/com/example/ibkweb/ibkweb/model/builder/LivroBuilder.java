package com.example.ibkweb.ibkweb.model.builder;

import com.example.ibkweb.ibkweb.client.model.output.LivroClientOutput;
import com.example.ibkweb.ibkweb.model.output.LivroOutput;

/**
 * Created by gabriel on 13/08/17.
 */
public class LivroBuilder {
    public static LivroOutput buildLivro(LivroClientOutput livroClientOutput){
        return new LivroOutput(livroClientOutput.getId(), livroClientOutput.getNome(), livroClientOutput.getAutor());
    }
}
