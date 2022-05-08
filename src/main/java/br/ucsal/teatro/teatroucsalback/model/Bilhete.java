package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Bilhete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne (fetch = FetchType.LAZY)
    private Espetaculo espetaculo;
    private LocalDateTime dataCompra;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    private boolean ehVIP;
    private boolean retirado;
    private double taxaDeEntrega;
    private double valorPago;
    private Long idCadeira;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Espetaculo getEspetaculo() {
        return espetaculo;
    }

    public void setEspetaculo(Espetaculo espetaculo) {
        this.espetaculo = espetaculo;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isEhVIP() {
        return ehVIP;
    }

    public void setEhVIP(boolean ehVIP) {
        this.ehVIP = ehVIP;
    }

    public boolean isRetirado() {
        return retirado;
    }

    public void setRetirado(boolean retirado) {
        this.retirado = retirado;
    }

    public double getTaxaDeEntrega() {
        return taxaDeEntrega;
    }

    public void setTaxaDeEntrega(double taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Long getIdCadeira() {
        return idCadeira;
    }

    public void setIdCadeira(Long idCadeira) {
        this.idCadeira = idCadeira;
    }
}
