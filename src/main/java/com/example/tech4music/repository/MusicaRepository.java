package com.example.tech4music.repository;

import com.example.tech4music.model.Musica;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
