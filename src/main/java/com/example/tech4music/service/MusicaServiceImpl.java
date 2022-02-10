package com.example.tech4music.service;

import java.util.List;

import com.example.tech4music.model.Musica;
import com.example.tech4music.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaServiceImpl implements MusicaService {
    @Autowired
    private MusicaRepository repositorio;

    public Musica salvar(Musica musica){
        return repositorio.save(musica);
    }

    public List<Musica> obterTodasMusica(){
        return repositorio.findAll();
    }
    
    
}
