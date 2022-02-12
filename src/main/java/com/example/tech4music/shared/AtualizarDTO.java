package com.example.tech4music.shared;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.tech4music.model.Musica;

public class AtualizarDTO {
    @NotBlank(message = "O id precisa ser preenchido com valores válidos.")
    @NotEmpty(message = "O id precisa ser preenchido.")
    @NotNull(message = "O id precisa ser um valor válido.")
    private String id;
    private Integer anoLancamento;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public static AtualizarDTO parse(Musica musica) {
        AtualizarDTO dto = new AtualizarDTO();
        dto.setId(musica.getId());
        dto.setAnoLancamento(musica.getAnoLancamento());
        return dto;
    }
}