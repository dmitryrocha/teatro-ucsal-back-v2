package br.ucsal.teatro.teatroucsalback.dto;

import br.ucsal.teatro.teatroucsalback.model.Bilhete;
import br.ucsal.teatro.teatroucsalback.model.Espetaculo;
import br.ucsal.teatro.teatroucsalback.model.Teatro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EspetaculoDto {

    private String titulo;
    private String sinopse;
    private Double valorBase;
    private LocalDateTime data;
    private Long teatroId;
    private List<Long> bilhetesId;

    public EspetaculoDto(Espetaculo espetaculo) {
        this.titulo = espetaculo.getTitulo();
        this.sinopse = espetaculo.getSinopse();
        this.valorBase = espetaculo.getValorBase();
        this.data = espetaculo.getData();
        Teatro teatro = espetaculo.getTeatro();
        this.teatroId = teatro.getId();
        List<Bilhete> bilhetes = espetaculo.getBilhetesVendidos();
        List<Long> listBilhetesId = new ArrayList<>();
        for (Bilhete bilhete : bilhetes) {
            listBilhetesId.add(bilhete.getId());
        }
        this.bilhetesId = listBilhetesId;
    }

    public EspetaculoDto() {}

    public static List<EspetaculoDto> conversor(List<Espetaculo> espetaculos) {
        return espetaculos.stream().map(EspetaculoDto::new).collect(Collectors.toList());
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

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Long getTeatroId() {
        return teatroId;
    }

    public void setTeatroId(Long teatroId) {
        this.teatroId = teatroId;
    }

    public List<Long> getBilhetesId() {
        return bilhetesId;
    }

    public void setBilhetesId(List<Long> bilhetesId) {
        this.bilhetesId = bilhetesId;
    }
}
