package br.ucsal.teatro.teatroucsalback.repository;

import br.ucsal.teatro.teatroucsalback.model.Teatro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeatroRepository extends JpaRepository<Teatro, Long> {
}
