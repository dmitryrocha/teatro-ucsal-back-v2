package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teatro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany (mappedBy = "teatro", cascade = CascadeType.ALL)
    private List<Fila> filas;
    @OneToMany(mappedBy = "teatro", cascade = CascadeType.ALL)
    private List<Espetaculo> espetaculos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Fila> getFilas() {
        return filas;
    }

    public void setFilas(List<Fila> filas) {
        this.filas = filas;
    }

    public List<Espetaculo> getEspetaculos() {
        return espetaculos;
    }

    public void setEspetaculos(List<Espetaculo> espetaculos) {
        this.espetaculos = espetaculos;
    }
}
