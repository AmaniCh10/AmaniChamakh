package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
    @Table
    public class Reservation  {
        @Id
        @GeneratedValue()
        private String idReservation;
        private Date anneeUniversitaire;
        private Boolean estValide;
    }

