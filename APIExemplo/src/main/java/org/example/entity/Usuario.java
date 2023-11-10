package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column
    @NotEmpty(message = "Login vazio")
    private String login;
    @Column
    @NotEmpty(message = "Senha vazia")
    private  String senha;
    @Column
    private boolean admin;
}
