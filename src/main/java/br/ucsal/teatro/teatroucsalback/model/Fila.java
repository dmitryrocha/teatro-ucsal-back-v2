package br.ucsal.teatro.teatroucsalback.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fila {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double agio;
    @OneToMany (mappedBy = "fila", cascade = CascadeType.ALL)
    private List<Cadeira> cadeiras;
    @ManyToOne(fetch = FetchType.LAZY)
    private Teatro teatro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAgio() {
        return agio;
    }

    public void setAgio(double agio) {
        this.agio = agio;
    }

    public List<Cadeira> getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(List<Cadeira> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }
}
