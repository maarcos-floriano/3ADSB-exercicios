package school.sptech.webaula3.controller.dto;

import school.sptech.webaula3.entity.Usuario;

public record UsuarioDTO(
    Integer id,
    String nome,
    String email,
    String senha,
    String cpf
) {
    public UsuarioDTO {
        if (nome == null || email == null || senha == null || cpf == null) {
            throw new IllegalArgumentException("Todos os campos são obrigatórios");
        }
    }

    public Usuario toEntity() {
        return new Usuario(nome, email, senha, cpf);
    }

    public static UsuarioDTO fromEntity(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getCpf());
    }
}
