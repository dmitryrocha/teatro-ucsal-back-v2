package br.ucsal.teatro.teatroucsalback.service;

import br.ucsal.teatro.teatroucsalback.dto.UsuarioDto;
import br.ucsal.teatro.teatroucsalback.model.Endereco;
import br.ucsal.teatro.teatroucsalback.model.Usuario;
import br.ucsal.teatro.teatroucsalback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void save(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDto.getNome());
        usuario.setCpf(usuarioDto.getCpf());
        usuario.setUsuario(usuarioDto.getUsuario());
        usuario.setSenha(usuarioDto.getSenha());

        Endereco endereco = new Endereco();
        endereco.setRua(usuarioDto.getRua());
        endereco.setComplemento(usuarioDto.getComplemento());
        endereco.setCep(usuarioDto.getCep());
        endereco.setCidade(usuarioDto.getCidade());
        endereco.setEstado(usuarioDto.getEstado());
        usuario.setEndereco(endereco);

        usuarioRepository.save(usuario);
    }
}
