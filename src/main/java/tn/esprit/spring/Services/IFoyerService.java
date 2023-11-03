package tn.esprit.spring.Services;


import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;
import java.util.Set;

public interface IFoyerService {
    Foyer addFoyer(Foyer f);
    List<Foyer> addAll(List<Foyer> foyers);
    Foyer editFoyer(Foyer f);
    List<Foyer> findAll();
    Foyer findById(long id);
    void deleteById(long id);
    void Delete(Foyer f);
    //List<Foyer> findFoyerByBloc(Bloc bloc);
    //List<Foyer> findByBlocAndIdFoyer(Bloc bloc,Long idfoyer);

}
