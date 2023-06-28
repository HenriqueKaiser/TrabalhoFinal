package com.example.corridanaselva.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Maratonista {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private Long numeroCelular;
    private Long numeroEmergencia;
    private String grupoSanguineo;
    private String rGeral;


}
