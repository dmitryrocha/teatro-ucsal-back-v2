package br.ucsal.teatro.teatroucsalback.controller;

import br.ucsal.teatro.teatroucsalback.dto.TeatroDto;
import br.ucsal.teatro.teatroucsalback.model.Teatro;
import br.ucsal.teatro.teatroucsalback.repository.TeatroRepository;
import br.ucsal.teatro.teatroucsalback.service.TeatroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/teatro")
public class TeatroController {

    @Autowired
    private TeatroRepository repository;
    @Autowired
    private TeatroService service;

    @GetMapping
    public List<TeatroDto> list() {
       List<Teatro> teatros = repository.findAll();
       return TeatroDto.conversor(teatros);
    }

    @PostMapping
    public void save(@RequestBody TeatroDto teatroDto) {
        service.save(teatroDto);
    }
}
