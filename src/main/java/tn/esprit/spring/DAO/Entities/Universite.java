package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

@Table(name = "universite")
@Entity
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;

}
