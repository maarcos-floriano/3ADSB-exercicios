package sptech.school.continuada2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sptech.school.continuada2.entity.Personagem;
import sptech.school.continuada2.exception.NaoEncontradoException;
import sptech.school.continuada2.repository.PersonagemRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonagemService {

    private final RegiaoService regiaoService;
    private final PersonagemRepository personagemRepository;

    //WARN: Já esta pronto! pule para o próximo
    public List<Personagem> listar() {
        return personagemRepository.findAll();
    }

    //TODO: Implementar buscar por ID
    public Personagem buscarPorId(Integer id) {
        Optional<Personagem> personagemOptional = personagemRepository.findById(id);

        if (personagemOptional.isEmpty()) {
            throw new NaoEncontradoException("Personagem não encontrado");
        }

        return personagemOptional.get();
    }

    //TODO: Implementar cadastro (use a service de região para buscar a região pelo ID)
    public Personagem cadastrar(Personagem personagem, int regiaoId) {
        personagem.setRegiao(regiaoService.buscarPorId(regiaoId));
        return personagemRepository.save(personagem);
    }

    //TODO: Implementar pesquisa por nome da região aproximado e ignorando maiúsculas e minúsculas
    public List<Personagem> buscarPorRegiaoNomeAproximado(String nome) {
        List<Personagem> personagensEncontrados = personagemRepository.findByRegiaoNomeContainingIgnoreCase(nome);

        return personagensEncontrados;
    }

    //TODO: Implementar pesquisa por função principal e sigla da região (valores exatos)
    public List<Personagem> buscarPorfuncaoPrincipalAndRegiaoSigla(String funcaoPrincipal, String sigla) {
        List<Personagem> personagensEncontrados = personagemRepository.findByFuncaoPrincipalAndRegiaoSigla(funcaoPrincipal, sigla);

        return personagensEncontrados;
    }
}
