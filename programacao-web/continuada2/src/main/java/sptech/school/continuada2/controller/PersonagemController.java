package sptech.school.continuada2.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.continuada2.dto.personagem.PersonagemCreateDto;
import sptech.school.continuada2.dto.personagem.PersonagemMapper;
import sptech.school.continuada2.dto.personagem.PersonagemResponseDto;
import sptech.school.continuada2.entity.Personagem;
import sptech.school.continuada2.service.PersonagemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/personagens")
public class PersonagemController {

    private final PersonagemService personagemService;

    // TODO: Implementar o cadastro
    @PostMapping
    public ResponseEntity<PersonagemResponseDto> cadastrar(@RequestBody @Valid PersonagemCreateDto personagemCreateDto) {

        Personagem personagem = PersonagemMapper.toEntity(personagemCreateDto);
        Personagem personagemCadastrado = personagemService.cadastrar(personagem, personagemCreateDto.getRegiaoId());
        PersonagemResponseDto personagemResponseDto = PersonagemMapper.toDto(personagemCadastrado);

        if (personagemResponseDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(201).body(personagemResponseDto);
    }

    // TODO: Implementar a listagem
    @GetMapping
    public ResponseEntity<List<PersonagemResponseDto>> listar() {
        List<Personagem> personagens = personagemService.listar();

        List<PersonagemResponseDto> personagemResponseDtos = personagens.stream()
                .map(PersonagemMapper::toDto)
                .toList();

        if (personagemResponseDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(personagemResponseDtos);
    }

    // TODO: Implementar a busca por ID
    @GetMapping("/{id}")
    public ResponseEntity<PersonagemResponseDto> buscarPorId(@PathVariable Integer id) {
        Personagem personagem = personagemService.buscarPorId(id);
        PersonagemResponseDto personagemResponseDto = PersonagemMapper.toDto(personagem);

        if (personagemResponseDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(personagemResponseDto);
    }

    // TODO: Implementar a busca por nome da região (aproximado e ignorando maiúsculas e minúsculas)
    @GetMapping("/filtro/regiao-nome")
    public ResponseEntity<List<PersonagemResponseDto>> buscarPorNome(@RequestParam String valorProcurado) {

        List<Personagem> personagens = personagemService.buscarPorRegiaoNomeAproximado(valorProcurado);
        List<PersonagemResponseDto> personagemResponseDtos = personagens.stream()
                .map(PersonagemMapper::toDto)
                .toList();

        if (personagemResponseDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(personagemResponseDtos);

    }

    // TODO: Implementar a busca por função e sigla da região (valores exatos)
    @GetMapping("/filtro/funcao-regiao")
    public ResponseEntity<List<PersonagemResponseDto>> buscarPorFuncaoRegiaoSigla(@RequestParam String funcao, @RequestParam String regiao) {

            List<Personagem> personagens = personagemService.buscarPorfuncaoPrincipalAndRegiaoSigla(funcao, regiao);
            List<PersonagemResponseDto> personagemResponseDtos = personagens.stream()
                    .map(PersonagemMapper::toDto)
                    .toList();

            if (personagemResponseDtos.isEmpty()) {
                return ResponseEntity.noContent().build();
            }

            return ResponseEntity.ok(personagemResponseDtos);
    }
}