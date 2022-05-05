package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Espetaculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String sinopse;
    private double valorBase;
    private LocalDateTime data;
    @ManyToOne(fetch = FetchType.LAZY)
    private Teatro teatro;
    @OneToMany(mappedBy = "espetaculo", cascade = CascadeType.ALL)
    private List<Bilhete> bilhetesVendidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }

    public List<Bilhete> getBilhetesVendidos() {
        return bilhetesVendidos;
    }

    public void setBilhetesVendidos(List<Bilhete> bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }
}
