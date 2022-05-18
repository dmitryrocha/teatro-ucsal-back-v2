package br.ucsal.teatro.teatroucsalback.controller;

import br.ucsal.teatro.teatroucsalback.dto.CadeiraDto;
import br.ucsal.teatro.teatroucsalback.model.Cadeira;
import br.ucsal.teatro.teatroucsalback.repository.CadeiraRepository;
import br.ucsal.teatro.teatroucsalback.service.CadeiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/cadeira")
public class CadeiraController {
    @Autowired
    private CadeiraRepository repository;
    @Autowired
    private CadeiraService service;

    @GetMapping
    public List<CadeiraDto> list() {
        List<Cadeira> cadeiras = repository.findAll();
        return CadeiraDto.conversor(cadeiras);
    }

    @PostMapping
    public void save (@RequestBody CadeiraDto cadeiraDto) {
        service.save(cadeiraDto);
    }
}
