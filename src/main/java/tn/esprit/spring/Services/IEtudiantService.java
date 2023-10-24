package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant E);
    List<Etudiant> addAll(List<Etudiant> etudiants);
    Etudiant editEtudiant(Etudiant E);
    List<Etudiant> findAll();
    Etudiant findById(long id);
    void deleteById(long id);
    void Delete(Etudiant b);
}
