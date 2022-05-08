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
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDto> lista() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return UsuarioDto.converter(usuarios);
    }

    @PostMapping
    public void save(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.save(usuarioDto);
    }
}
