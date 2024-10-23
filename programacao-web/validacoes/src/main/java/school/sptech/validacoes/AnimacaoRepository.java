package school.sptech.validacoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimacaoRepository extends JpaRepository<Animacao, Integer> {
}
