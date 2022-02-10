package com.example.tech4music.shared;

import com.example.tech4music.model.Musica;

public class MusicaDTO {    
    private String titulo;
    private String album;
    private String genero;
    private int anoLancamento;
    private String compositor;
    
    
    public MusicaDTO(String titulo, String album, String genero, int anoLancamento, String compositor) {
        this.titulo = titulo;
        this.album = album;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.compositor = compositor;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }      

    public static MusicaDTO from(Musica musica){
        return new MusicaDTO(musica.getTitulo(), musica.getAlbum(), musica.getGenero(), 
        musica.getAnoLancamento(), musica.getCompositor());
    }
}
