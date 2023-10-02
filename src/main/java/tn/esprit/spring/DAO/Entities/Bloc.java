package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

@Table(name = "Bloc")
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomBloc;
    private long capaciteBloc;
}
