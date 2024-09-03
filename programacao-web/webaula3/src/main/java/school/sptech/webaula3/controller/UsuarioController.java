package school.sptech.webaula3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.webaula3.entity.Usuario;
import school.sptech.webaula3.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsuarios(){

        return repository.findAll();

    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable int id){

        return repository.findById(id);

    }

}
