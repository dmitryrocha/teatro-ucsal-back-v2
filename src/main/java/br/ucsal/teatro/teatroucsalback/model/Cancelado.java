package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cancelado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataDeCancelamento;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataDeCancelamento() {
        return dataDeCancelamento;
    }

    public void setDataDeCancelamento(LocalDateTime dataDeCancelamento) {
        this.dataDeCancelamento = dataDeCancelamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
