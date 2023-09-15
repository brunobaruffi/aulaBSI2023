package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")

public class alunoController {

    @GetMapping("teste")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String teste(){
        return "HELLO WORD";
    }
}
