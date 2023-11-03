package tn.esprit.spring.Services;



import tn.esprit.spring.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre c);
    List<Chambre> addAll(List<Chambre> chambres);
    Chambre editChambre(Chambre c);
    List<Chambre> findAll();
    Chambre findById(long id);
    void deleteById(long id);
    void Delete(Chambre b);
   // List<Chambre> findByNumeroChambre(long idchambre);
}
