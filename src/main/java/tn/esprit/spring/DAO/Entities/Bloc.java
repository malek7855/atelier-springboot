package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Table(name = "Bloc")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<Chambre> chambre;


}
