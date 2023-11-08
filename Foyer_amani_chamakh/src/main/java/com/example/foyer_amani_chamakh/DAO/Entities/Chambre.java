package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idChambre;
    private String numChambre;
    private TypeChambre typec;
}