package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;


@Table(name = "utilisateur")
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName")
    private String nom;
    @Column(name = "lastName")
    private String prenom;
    private LocalDate dateNaissance; // YYYY-MM-JJ
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    @Temporal(TemporalType.DATE) // YYYY-MM-JJ hh:mm:ss
    private Date dateInscription;
    @Transient
    private int age;  //pour ne pas mapper l'attribut dans la BD

}
