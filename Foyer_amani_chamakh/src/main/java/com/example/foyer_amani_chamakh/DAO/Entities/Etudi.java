package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Etudiant")
public class Etudi {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
        private Long idEtud;
        private String nomet,prenomEt,ecole;
        private Long cin;
        private LocalDate dateNais;
    }

