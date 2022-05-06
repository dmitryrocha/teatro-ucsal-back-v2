package br.ucsal.teatro.teatroucsalback.repository;

import br.ucsal.teatro.teatroucsalback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
