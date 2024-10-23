package school.sptech.prova_ac1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public ResponseEntity<Usuario> cadastroUsuario(
            @RequestBody Usuario usuario
    ){

        usuario.setId(null);

        if (this.repository.findUsuarioByCpfOrEmail(usuario.getCpf(), usuario.getEmail()).isPresent()){
            return ResponseEntity.status(409).body(usuario);
        }

        Usuario novoUsuario = this.repository.save(usuario);

        return ResponseEntity.status(201).body(novoUsuario);

    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){

        List<Usuario> todosUsuarios = this.repository.findAll();

        if (todosUsuarios.isEmpty()) return ResponseEntity.status(204).body(todosUsuarios);

        return ResponseEntity.ok(todosUsuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioId(
            @PathVariable Integer id
    ){

        Optional<Usuario> usuario = this.repository.findById(id);

        if (usuario.isPresent()){
            return ResponseEntity.ok(usuario.get());
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletarUsuario(
            @PathVariable Integer id
    ){

        Optional<Usuario> usuario = this.repository.findById(id);

        if (usuario.isPresent()){
            this.repository.deleteById(id);
            return ResponseEntity.status(204).body(usuario.get());
        }

        return ResponseEntity.status(404).build();

    }

    @GetMapping("/filtro-data")
    public ResponseEntity<List<Usuario>> buscarPorData(
            @RequestParam LocalDate dataNascimento
            ){

        List<Usuario> usuarios = this.repository.findUsuarioByDataNascimentoAfter(dataNascimento);

        if (usuarios.isEmpty()){

            return ResponseEntity.status(204).build();

        }

        return ResponseEntity.status(200).body(usuarios);
    }

}
