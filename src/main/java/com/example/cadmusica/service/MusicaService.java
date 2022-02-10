package com.example.cadmusica.service;

import java.util.List;

import com.example.cadmusica.model.Musica;
import com.example.cadmusica.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository repositorio;

    public Musica salvar(Musica musica){
        return repositorio.save(musica);
    }

    public List<Musica> obtermusica(){
        return repositorio.findAll();
    }
    
}
