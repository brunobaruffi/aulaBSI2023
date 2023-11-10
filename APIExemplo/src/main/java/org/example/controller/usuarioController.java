package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.example.entity.Aluno;
import org.example.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.example.service.usuarioService;
@RestController
@RequestMapping("api/usuario")
public class usuarioController {

    @Autowired
    private usuarioService service;

    @PostMapping
    @Operation(
            method = "POST",
            description = "Salva um novo usuario",
            summary = "Sumario",
            tags = "/api/usuario")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void salvar(@RequestBody Usuario usuario)
    {
        service.salvar(usuario);
    }

}
