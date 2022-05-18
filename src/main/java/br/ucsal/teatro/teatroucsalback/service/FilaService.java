package br.ucsal.teatro.teatroucsalback.service;

import br.ucsal.teatro.teatroucsalback.dto.FilaDto;
import br.ucsal.teatro.teatroucsalback.model.Cadeira;
import br.ucsal.teatro.teatroucsalback.model.Fila;
import br.ucsal.teatro.teatroucsalback.model.Teatro;
import br.ucsal.teatro.teatroucsalback.repository.CadeiraRepository;
import br.ucsal.teatro.teatroucsalback.repository.FilaRepository;
import br.ucsal.teatro.teatroucsalback.repository.TeatroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilaService {
    @Autowired
    private FilaRepository repository;
    @Autowired
    private TeatroRepository teatroRepository;
    @Autowired
    CadeiraRepository cadeiraRepository;

    public void save(FilaDto filaDto) {
        Fila fila = new Fila();
        fila.setAgio(filaDto.getAgio());
        List<Cadeira> cadeiras = new ArrayList<>();
        for(int i = 0; i < filaDto.getCadeirasId().size(); i++) {
            Optional<Cadeira> cadeira = cadeiraRepository.findById(filaDto.getCadeirasId().get(i));
            if(cadeira.isPresent()) {
                cadeiras.add(cadeira.get());
            }
        }
        fila.setCadeiras(cadeiras);
        Teatro teatro = teatroRepository.findById(filaDto.getTeatroId()).orElse(null);
        fila.setTeatro(teatro);

        repository.save(fila);
    }
}
