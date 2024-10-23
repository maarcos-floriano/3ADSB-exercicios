package sptech.school.continuada2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.continuada2.entity.Personagem;

import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

    //TODO: Implementar as consultas personalizadas
    List<Personagem> findByRegiaoNomeContainingIgnoreCase(String nome);

    List<Personagem> findByFuncaoPrincipalAndRegiaoSigla(String funcaoPrincipal, String sigla);

}
