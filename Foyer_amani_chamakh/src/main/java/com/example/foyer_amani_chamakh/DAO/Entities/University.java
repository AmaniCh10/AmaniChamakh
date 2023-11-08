package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;


    @Entity
    @Table
    public class University {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
        private Long idUniversity;
        private String nomUniversity;
        private Long adresse;
    }

