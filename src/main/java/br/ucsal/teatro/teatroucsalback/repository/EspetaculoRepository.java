package br.ucsal.teatro.teatroucsalback.repository;

import br.ucsal.teatro.teatroucsalback.model.Espetaculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspetaculoRepository extends JpaRepository<Espetaculo, Long> {
}
