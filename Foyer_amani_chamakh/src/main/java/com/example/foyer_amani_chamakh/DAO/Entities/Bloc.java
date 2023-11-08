package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idbloc;
    private String nombloc;
    private Long capacitBloc;
}
