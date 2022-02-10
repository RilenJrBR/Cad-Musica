package com.example.cadmusica.service;

import java.util.List;

import com.example.cadmusica.model.Musica;

public interface MusicaService {
    Musica salvar(Musica musica);
    List<Musica> obterTodasMusica();
}
