package com.example.cadmusica.controller;

import com.example.cadmusica.model.Musica;
import com.example.cadmusica.service.MusicaService;
import com.example.cadmusica.shared.MusicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/musica")
public class MusicaController {
    @Autowired
    private MusicaService servico;

   @PostMapping
    public ResponseEntity<MusicaDTO> criar(@RequestBody MusicaDTO dto){
        Musica musica = Musica.from(dto);
        Musica musicaSalva = servico.salvar(musica);
        MusicaDTO dtoresponse =  MusicaDTO.from(musicaSalva);
        return new ResponseEntity<>(dtoresponse, HttpStatus.CREATED);
    }
}
