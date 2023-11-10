package org.example.repository;

import org.example.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarios extends JpaRepository<Usuario, Integer> {
}
