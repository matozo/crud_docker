package com.example.matozao.crud_docker.controller;

import com.example.matozao.crud_docker.domain.Vaga;
import com.example.matozao.crud_docker.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/vagas", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class VagaController  {

    @Autowired
    private VagaRepository vagaRepository;

    @PostMapping
    private String gravarVaga(@RequestBody Vaga vaga){
        vagaRepository.save(vaga);
        return "Deu cero man!";
    }

    @PutMapping
    private String atualizarVaga(@RequestBody Vaga vaga){
        vagaRepository.save(vaga);
        return "Atualizado bicho";

    }





}
