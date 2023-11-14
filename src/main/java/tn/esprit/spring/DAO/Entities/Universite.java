package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@Table(name = "universite")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    Foyer foyer;

}
