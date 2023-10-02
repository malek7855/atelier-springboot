package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

@Table(name = "Foyer")
@Entity
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;
}
