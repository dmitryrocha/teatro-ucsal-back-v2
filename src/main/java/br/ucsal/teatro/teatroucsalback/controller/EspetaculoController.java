package br.ucsal.teatro.teatroucsalback.controller;

import br.ucsal.teatro.teatroucsalback.dto.EspetaculoDto;
import br.ucsal.teatro.teatroucsalback.model.Espetaculo;
import br.ucsal.teatro.teatroucsalback.repository.EspetaculoRepository;
import br.ucsal.teatro.teatroucsalback.service.EspetaculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/espetaculo")
public class EspetaculoController {

    @Autowired
    private EspetaculoRepository repository;
    @Autowired
    private EspetaculoService service;

    @GetMapping
    public List<EspetaculoDto> list() {
        List<Espetaculo> espetaculos = repository.findAll();
        return EspetaculoDto.conversor(espetaculos);
    }

    @PostMapping
    public void save(@RequestBody EspetaculoDto espetaculoDto) {

    }
}
