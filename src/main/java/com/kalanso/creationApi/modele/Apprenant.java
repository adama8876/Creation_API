package com.kalanso.creationApi.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String prenom;
    private String nom;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
