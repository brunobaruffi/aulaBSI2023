package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Table(name="aluno")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(name="id")
        private int id;
        @NotEmpty(message="Nome não pode ser vazio")
        @Column(name="nome")
        private String nome;
        @JsonFormat(pattern="yyyy-MM-dd")
        @NotNull(message="Data obrigatoria")
        @Column(name="nas")
        private Date datanas;
        @NotEmpty(message="Não pode ser vaizo")
        @Column(name="cpf", length = 15)
        private String cpf;

}
