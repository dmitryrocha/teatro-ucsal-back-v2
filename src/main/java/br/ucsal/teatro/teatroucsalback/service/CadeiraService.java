package br.ucsal.teatro.teatroucsalback.service;

import br.ucsal.teatro.teatroucsalback.dto.CadeiraDto;
import br.ucsal.teatro.teatroucsalback.model.Cadeira;
import br.ucsal.teatro.teatroucsalback.model.Fila;
import br.ucsal.teatro.teatroucsalback.repository.CadeiraRepository;
import br.ucsal.teatro.teatroucsalback.repository.FilaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadeiraService {

    @Autowired
    private CadeiraRepository repository;
    @Autowired
    private FilaRepository filaRepository;

    public void save(CadeiraDto cadeiraDto) {
        Cadeira cadeira = new Cadeira();
        cadeira.setLocalizacao(cadeiraDto.getLocalizacao());
        cadeira.setValorCadeira(cadeiraDto.getValorCadeira());
        cadeira.setStatusEnum(cadeiraDto.getStatusEnum());
        Fila fila = filaRepository.getById(cadeiraDto.getFilaId());
        cadeira.setFila(fila);

        repository.save(cadeira);
    }
}
