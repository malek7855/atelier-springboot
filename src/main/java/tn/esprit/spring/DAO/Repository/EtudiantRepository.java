package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    ////Recherche des étudiants par nom d'école et date de naissance après une certaine date
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String nomEcole, Date d);
    List<Etudiant> findByReservationsAnneeUniversitaireOrderByDateNaissance(Date Annee);
}
