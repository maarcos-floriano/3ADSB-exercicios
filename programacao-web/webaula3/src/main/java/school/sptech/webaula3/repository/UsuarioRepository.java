package school.sptech.webaula3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.webaula3.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
