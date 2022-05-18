package br.ucsal.teatro.teatroucsalback.dto;

import br.ucsal.teatro.teatroucsalback.model.Cadeira;
import br.ucsal.teatro.teatroucsalback.model.StatusEnum;

import java.util.List;
import java.util.stream.Collectors;

public class CadeiraDto {

    private Integer localizacao;
    private Double valorCadeira;
    private Long filaId;
    private StatusEnum statusEnum;

    public CadeiraDto() {}

    public CadeiraDto(Cadeira cadeira) {
        this.localizacao = cadeira.getLocalizacao();
        this.valorCadeira = cadeira.getValorCadeira();
        this.filaId = cadeira.getFila().getId();
        this.statusEnum = cadeira.getStatusEnum();
    }

    public static List<CadeiraDto> conversor(List<Cadeira> cadeiras) {
        return cadeiras.stream().map(CadeiraDto::new).collect(Collectors.toList());
    }

    public Integer getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Integer localizacao) {
        this.localizacao = localizacao;
    }

    public Double getValorCadeira() {
        return valorCadeira;
    }

    public void setValorCadeira(Double valorCadeira) {
        this.valorCadeira = valorCadeira;
    }

    public Long getFilaId() {
        return filaId;
    }

    public void setFilaId(Long filaId) {
        this.filaId = filaId;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }
}
