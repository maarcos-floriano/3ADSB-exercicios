package school.sptech.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AnimacaoController {

    @Autowired
    private AnimacaoRepository repository;

    @GetMapping
    public ResponseEntity<List<Animacao>> listar(){

        List<Animacao> animacoes = repository.findAll();

        if (animacoes.isEmpty()){

            return ResponseEntity.noContent().build();

        }

        return ResponseEntity.ok(animacoes);

    }

    @PostMapping
    public ResponseEntity<Animacao> cadastrar(
            @RequestBody Animacao animacao
    ){

        animacao.setId(null);

        Animacao animacaoSalva = repository.save(animacao);

        return ResponseEntity.status(201).body(animacaoSalva);

    }



}
