package com.example.ibkweb.ibkweb.service;

import com.example.ibkweb.ibkweb.client.LivroClient;
import com.example.ibkweb.ibkweb.model.builder.LivroBuilder;
import com.example.ibkweb.ibkweb.model.input.LivroInput;
import com.example.ibkweb.ibkweb.model.output.LivroOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroClient livroClient;

    public List<LivroOutput> findAllLivros() {
        throw new NotImplementedException();
    }

    public LivroOutput findLivroById(long id) {
        return LivroBuilder.buildLivro(livroClient.getLivro());
    }

    public void createLivro(LivroInput livro) {
        throw new NotImplementedException();
    }

    public void updateLivro(LivroInput livro) {
        throw new NotImplementedException();
    }

    public void deleteLivroById(long id) {
        throw new NotImplementedException();
    }
}
