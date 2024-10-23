package school.sptech.validacoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Animacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 2, max = 10)
    private String nome;

    private LocalDate dataEstreia;

    private Integer qtdEpisodios;

    private String cnpjEstudioResponsavel;

    private Double faturamento;

    private String diretor;

    private String cpfDiretor;

}
