package org.example.controller;

import org.example.entity.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.example.repository.alunos;

import java.util.List;

@RestController
@RequestMapping("api/aluno")

public class alunoController {

    private alunos alunosRepository;

    public alunoController(alunos alunosRepository) {
        this.alunosRepository = alunosRepository;
    }

    @GetMapping("teste")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String teste(){
        return "HELLO WORD";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Aluno> find()
    {
        return alunosRepository.findAll();
    }
}
