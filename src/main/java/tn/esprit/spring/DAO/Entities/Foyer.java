package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Table(name = "Foyer")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Set<Bloc> bloc;


}
