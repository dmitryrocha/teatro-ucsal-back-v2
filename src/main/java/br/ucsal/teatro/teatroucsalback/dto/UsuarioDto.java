package br.ucsal.teatro.teatroucsalback.dto;

import br.ucsal.teatro.teatroucsalback.model.Endereco;
import br.ucsal.teatro.teatroucsalback.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDto {

    private String nome;
    private String cpf;
    private String usuario;
    private String senha;
    private String rua;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

    public UsuarioDto() {}

    public UsuarioDto(Usuario usuario) {
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.usuario = usuario.getUsuario();
        this.senha = usuario.getSenha();
        Endereco endereco = usuario.getEndereco();
        this.rua = endereco.getRua();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
    }

    public static List<UsuarioDto> conversor(List<Usuario> usuarios) {
        return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
