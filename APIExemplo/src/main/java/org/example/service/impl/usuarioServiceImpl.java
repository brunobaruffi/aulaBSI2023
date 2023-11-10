package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.Usuario;
import org.example.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.usuarios;
@Service
@RequiredArgsConstructor
public class usuarioServiceImpl implements usuarioService{
    @Autowired
    private usuarios usuariosRepository;
    public void salvar(Usuario usuario){
        usuariosRepository.save(usuario);
    }
}
