package com.example.ibkweb.ibkweb.client;

import com.example.ibkweb.ibkweb.client.model.output.LivroClientOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gabriel on 13/08/17.
 */
@Service
public class LivroClient {

    @Autowired
    private RestTemplate restTemplate;

    final String url = "http://localhost:8090/livro/";

    public LivroClientOutput getLivro(){
        return restTemplate.getForObject(url+"getLivro", LivroClientOutput.class);
    }
}
