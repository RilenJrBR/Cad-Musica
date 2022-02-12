package com.example.tech4music.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.example.tech4music.model.Musica;
import com.example.tech4music.service.MusicaService;
import com.example.tech4music.shared.AtualizarDTO;
import com.example.tech4music.shared.MusicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tech4music")
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

    @GetMapping
    public ResponseEntity<List<MusicaDTO>> obterTodasMusica(@RequestBody MusicaDTO dto){
        List<Musica> musica = servico.obterTodasMusica();

        List<MusicaDTO> dtos = musica

            .stream()
            .map(MusicaDTO::from)
            .collect(Collectors.toList());

        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @PutMapping
    public AtualizarDTO atualizarMusica(@RequestBody MusicaDTO dto) {
        Musica musica = servico.atualizar(dto.getId(), dto.getAnoLancamento());
        return AtualizarDTO.parse(musica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarMusica(@PathVariable String id){
        servico.deletarMusica(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
