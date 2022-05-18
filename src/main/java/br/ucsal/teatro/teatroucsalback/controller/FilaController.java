package br.ucsal.teatro.teatroucsalback.controller;

import br.ucsal.teatro.teatroucsalback.dto.FilaDto;
import br.ucsal.teatro.teatroucsalback.model.Fila;
import br.ucsal.teatro.teatroucsalback.repository.FilaRepository;
import br.ucsal.teatro.teatroucsalback.service.FilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/fila")
public class FilaController {

    @Autowired
    private FilaRepository repository;
    @Autowired
    private FilaService service;

    @GetMapping
    public List<FilaDto> list() {
        List<Fila> filas = repository.findAll();
        return FilaDto.conversor(filas);
    }

    @PostMapping
    public void save(@RequestBody FilaDto filaDto) {
        service.save(filaDto);
    }

}
