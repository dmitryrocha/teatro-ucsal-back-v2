package br.ucsal.teatro.teatroucsalback.controller;

import br.ucsal.teatro.teatroucsalback.dto.UsuarioDto;
import br.ucsal.teatro.teatroucsalback.model.Usuario;
import br.ucsal.teatro.teatroucsalback.repository.UsuarioRepository;
import br.ucsal.teatro.teatroucsalback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioDto> list() {
        List<Usuario> usuarios = repository.findAll();
        return UsuarioDto.conversor(usuarios);
    }

    @PostMapping
    public void save(@RequestBody UsuarioDto usuarioDto) {
        service.save(usuarioDto);
    }
}
