package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Foyer")

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idFoyer;
    private String nomFoyer;
    private Long capacitFoyer;
}
