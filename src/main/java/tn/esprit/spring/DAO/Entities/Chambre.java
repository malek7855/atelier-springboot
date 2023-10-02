package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

@Table(name = "chambre")
@Entity
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
}
