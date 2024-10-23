package sptech.school.continuada2.dto.personagem;

import sptech.school.continuada2.entity.Personagem;

public class PersonagemMapper {

    public static Personagem toEntity(PersonagemCreateDto dto) {

        if (dto == null) {
            return null;
        }

        Personagem entity = new Personagem();
        entity.setNome(dto.getNome());
        entity.setUltimate(dto.getUltimate());
        entity.setFuncaoPrincipal(dto.getFuncaoPrincipal());
        return entity;
    }

    public static PersonagemResponseDto toDto(Personagem entity) {

        if (entity == null) {
            return null;
        }

        PersonagemResponseDto dto = new PersonagemResponseDto();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setUltimate(entity.getUltimate());
        dto.setFuncaoPrincipal(entity.getFuncaoPrincipal());
        dto.setRegiao(PersonagemResponseDto.RegiaoPersonagemResponseDto.builder()
                .id(entity.getRegiao().getId())
                .nome(entity.getRegiao().getNome())
                .descricao(entity.getRegiao().getDescricao())
                .sigla(entity.getRegiao().getSigla())
                .build());

        return dto;
    }
}
