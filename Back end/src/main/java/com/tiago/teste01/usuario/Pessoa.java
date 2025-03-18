package com.tiago.teste01.usuario;

import jakarta.persistence.*;
import lombok.*;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)  // Define restrições na coluna
    private String nome;

    @Column(unique = true, nullable = false, length = 11) // CPF deve ser único
    private String cpf;

}
