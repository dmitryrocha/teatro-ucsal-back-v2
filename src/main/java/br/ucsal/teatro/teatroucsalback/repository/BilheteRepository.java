package br.ucsal.teatro.teatroucsalback.repository;

import br.ucsal.teatro.teatroucsalback.model.Bilhete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BilheteRepository extends JpaRepository<Bilhete, Long> {
}
