package br.ucsal.teatro.teatroucsalback.service;

import br.ucsal.teatro.teatroucsalback.dto.TeatroDto;
import br.ucsal.teatro.teatroucsalback.model.Teatro;
import br.ucsal.teatro.teatroucsalback.repository.TeatroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeatroService {

    @Autowired
    private TeatroRepository repository;

    public void save(TeatroDto teatroDto) {
        Teatro teatro = new Teatro();
        teatro.setNome(teatroDto.getNome());

        repository.save(teatro);
    }
}
