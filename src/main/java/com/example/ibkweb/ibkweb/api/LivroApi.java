package com.example.ibkweb.ibkweb.api;

import com.example.ibkweb.ibkweb.model.input.LivroInput;
import com.example.ibkweb.ibkweb.model.output.LivroOutput;
import com.example.ibkweb.ibkweb.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping(value = "/api/livro")
public class LivroApi {
    @Autowired
    LivroService livroService;


    @RequestMapping(value = "/getLivro", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LivroOutput> getLivro() {
        //LivroOutput livroOutput = new LivroOutput(1l,"teste","teste");
        LivroOutput livro = livroService.findLivroById(1l);
        return ResponseEntity.ok(livro);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<LivroOutput>> listAllLivros() {
        List<LivroOutput> livros = livroService.findAllLivros();
        if(livros.isEmpty()){
            return new ResponseEntity<List<LivroOutput>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<LivroOutput>>(livros, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<LivroOutput> getLivro(@PathVariable("id") long id) {
        System.out.println("Fetching Livro with id " + id);
        try {
            LivroOutput livro = livroService.findLivroById(id);
            return new ResponseEntity<LivroOutput>(livro, HttpStatus.OK);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Livro with id " + id + " not found");
            return new ResponseEntity<LivroOutput>(HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> createLivro(@RequestBody LivroInput livro) {
        livroService.createLivro(livro);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateLivro(@RequestBody LivroInput livro) {
        livroService.updateLivro(livro);
        return new ResponseEntity( HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public  ResponseEntity deleteLivro(@RequestBody long id){
        livroService.deleteLivroById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
