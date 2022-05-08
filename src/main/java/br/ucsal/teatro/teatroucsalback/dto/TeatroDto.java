package br.ucsal.teatro.teatroucsalback.dto;

import br.ucsal.teatro.teatroucsalback.model.Teatro;

import java.util.List;
import java.util.stream.Collectors;

public class TeatroDto {

    private String nome;

    public TeatroDto() {}

    public TeatroDto(Teatro teatro) {
        this.nome = teatro.getNome();
    }

    public static List<TeatroDto> conversor(List<Teatro> teatros) {
        return teatros.stream().map(TeatroDto::new).collect(Collectors.toList());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
