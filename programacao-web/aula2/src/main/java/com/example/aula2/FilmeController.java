package com.example.aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping("/favorito")
    public List<Filme> getFilmeFavorito(){

        Diretor diretor1 = new Diretor("Marcos");

        Filme filmeFavorito = new Filme(
                "Loud",
                diretor1
        );

        Diretor diretor2 = new Diretor("Floriano");

        Filme filmeFavorito2 = new Filme(
                "Fluxo",
                diretor2
        );

        List<Filme> filmes = List.of(filmeFavorito, filmeFavorito2);

        return filmes;
    }

}
