package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;

@Entity
public class Cadeira {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int localizacao;
    private double valorCadeira;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fila fila;
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public double getValorCadeira() {
        return valorCadeira;
    }

    public void setValorCadeira(double valorCadeira) {
        this.valorCadeira = valorCadeira;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }
}
