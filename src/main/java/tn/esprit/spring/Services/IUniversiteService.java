package tn.esprit.spring.Services;


import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite u);
    List<Universite> addAll(List<Universite> universites);
    Universite editUniversite(Universite u);
    List<Universite> findAll();
    Universite findById(long id);
    void deleteById(long id);
    void Delete(Universite u);
}
