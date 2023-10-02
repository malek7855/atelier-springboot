package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Eudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
}
