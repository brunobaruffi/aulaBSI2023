package org.example.controller;

import org.example.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.example.repository.alunos;
import org.example.service.alunoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/aluno")

public class alunoController {

    private alunos alunosRepository;

@Autowired
    private alunoService alunoService;
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
        return alunoService.buscarTodos();
    }
    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Aluno> findById(@PathVariable int id)
    {
        return alunoService.buscar(id);
    }
    @DeleteMapping(value = "{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id)
    {
        alunoService.exluir(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno salvar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno editar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }

}
