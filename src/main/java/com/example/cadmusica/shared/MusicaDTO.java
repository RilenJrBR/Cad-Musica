package com.example.cadmusica.shared;

import javax.validation.constraints.NotBlank;

import com.example.cadmusica.model.Musica;

public class MusicaDTO {

    @NotBlank(message = "Nome deve ser prenchido com um titulo valido.")
    private String titulo;
    
    @NotBlank(message = "Nome deve ser prenchido com um album valido.")
    private String album;
    private int anoLancamento;
    
    public MusicaDTO(String titulo, String album, int anoLancamento) {
        this.titulo = titulo;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public static MusicaDTO from(Musica musica){
        return new MusicaDTO(musica.getTitulo(), musica.getAlbum(), musica.getAnoLancamento());
    }
}
