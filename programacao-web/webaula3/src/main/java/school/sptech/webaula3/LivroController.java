package school.sptech.webaula3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @PostMapping()
    public Livro cadastrar(@RequestBody Livro livroParaCadastrar){

        Livro livroSalvo = this.repository.save(livroParaCadastrar);


        return livroSalvo;
    }

    @GetMapping
    public List<Livro> listar(){
        return this.repository.findAll();
    }

}
