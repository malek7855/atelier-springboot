package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Table(name = "Reservation")
@Entity
public class Reservation {

    @Id
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private LocalDate anneeUniversitaire;
    private boolean estValide;
}
