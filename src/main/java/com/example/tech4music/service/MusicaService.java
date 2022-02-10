package com.example.tech4music.service;

import java.util.List;

import com.example.tech4music.model.Musica;

public interface MusicaService {
    Musica salvar(Musica musica);
    List<Musica> obterTodasMusica();
}
