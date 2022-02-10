package com.example.cadmusica.model;

import com.example.cadmusica.shared.MusicaDTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musica")
public class Musica {
    @Id
    private String id;
    private String titulo;
    private String album;
    private String genero;
    private Integer anoLancamento;
    private String compositor;
    
    public Musica(String titulo, String album, Integer anoLancamento) {
        this.titulo = titulo;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
     
    public static Musica from(MusicaDTO dto){
        return new Musica(dto.getTitulo(), dto.getAlbum(), dto.getAnoLancamento());
    }
   
}
