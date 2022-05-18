package br.ucsal.teatro.teatroucsalback.dto;

import br.ucsal.teatro.teatroucsalback.model.Cadeira;
import br.ucsal.teatro.teatroucsalback.model.Fila;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilaDto {

    private Double agio;
    private List<Long> cadeirasId;
    private Long teatroId;

    public FilaDto() {}

    public FilaDto(Fila fila) {
        this.agio = fila.getAgio();
        this.cadeirasId = cadeiraConversor(fila.getCadeiras());
        this.teatroId = fila.getTeatro().getId();
    }

    public static List<FilaDto> conversor(List<Fila> filas) {
        return filas.stream().map(FilaDto::new).collect(Collectors.toList());
    }

    public Double getAgio() {
        return agio;
    }

    public void setAgio(Double agio) {
        this.agio = agio;
    }

    public Long getTeatroId() {
        return teatroId;
    }

    public void setTeatroId(Long teatroId) {
        this.teatroId = teatroId;
    }

    public List<Long> getCadeirasId() {
        return cadeirasId;
    }

    public void setCadeirasId(List<Long> cadeirasId) {
        this.cadeirasId = cadeirasId;
    }

    public List<Long> cadeiraConversor(List<Cadeira> cadeiras) {
        List<Long> caderiasId = new ArrayList<>();
        for (Cadeira cadeira : cadeiras) {
            caderiasId.add(cadeira.getId());
        }
        return caderiasId;
    }
}
