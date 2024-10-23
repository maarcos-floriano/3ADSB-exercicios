package sptech.school.continuada2.dto.personagem;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PersonagemCreateDto {
    //TODO: Implementar validações

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private String ultimate;

    @NotNull
    @NotBlank
    private String funcaoPrincipal;

    @NotNull
    @Positive
    private int regiaoId;
}
