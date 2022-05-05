package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String senha;
    private String nome;
    private String cpf;
    private LocalDateTime suspensoAte;
    @Embedded
    private Endereco endereco;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Cancelado> bilhetesCancelasdos;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Bilhete> bilhetes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getSuspensoAte() {
        return suspensoAte;
    }

    public void setSuspensoAte(LocalDateTime suspensoAte) {
        this.suspensoAte = suspensoAte;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cancelado> getBilhetesCancelasdos() {
        return bilhetesCancelasdos;
    }

    public void setBilhetesCancelasdos(List<Cancelado> bilhetesCancelasdos) {
        this.bilhetesCancelasdos = bilhetesCancelasdos;
    }

    public List<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(List<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }
}
