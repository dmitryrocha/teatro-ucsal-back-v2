package br.ucsal.teatro.teatroucsalback.service;

import br.ucsal.teatro.teatroucsalback.dto.EspetaculoDto;
import br.ucsal.teatro.teatroucsalback.model.Bilhete;
import br.ucsal.teatro.teatroucsalback.model.Espetaculo;
import br.ucsal.teatro.teatroucsalback.model.Teatro;
import br.ucsal.teatro.teatroucsalback.repository.BilheteRepository;
import br.ucsal.teatro.teatroucsalback.repository.EspetaculoRepository;
import br.ucsal.teatro.teatroucsalback.repository.TeatroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EspetaculoService {

    @Autowired
    private EspetaculoRepository repository;
    @Autowired
    private TeatroRepository teatroRepository;
    @Autowired
    private BilheteRepository bilheteRepository;

    public void save(EspetaculoDto espetaculoDto) {
        Espetaculo espetaculo = new Espetaculo();
        espetaculo.setTitulo(espetaculoDto.getTitulo());
        espetaculo.setSinopse(espetaculoDto.getSinopse());
        espetaculo.setValorBase(espetaculoDto.getValorBase());
        espetaculo.setData(espetaculoDto.getData());
        Teatro teatro = teatroRepository.findById(espetaculoDto.getTeatroId()).orElse(null);
        espetaculo.setTeatro(teatro);
        List<Bilhete> listaBilhetes = new ArrayList<>();
        for(int x = 0; x < espetaculoDto.getBilhetesId().size(); x++) {
            Optional<Bilhete> bilhete = bilheteRepository.findById(espetaculoDto.getBilhetesId().get(x));
            if(bilhete.isPresent()) {
                listaBilhetes.add(bilhete.get());
            }
        }
        espetaculo.setBilhetesVendidos(listaBilhetes);

        repository.save(espetaculo);
    }
}
