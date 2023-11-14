package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface IBlocService {

    Bloc addBloc(Bloc b);
    List<Bloc> addAll(List<Bloc> blocs);
    Bloc editBloc(Bloc b);
    List<Bloc> findAll();
    Bloc findById(long id);
    void deleteById(long id);
    void Delete(Bloc b);
    Bloc findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(long capacityBloc);
    List<Bloc> findByCapaciteBlocAndNomBloc(long capacityBloc,String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(long capacityBloc);
    List<Bloc> findByNomBlocContaining(String sousChaine);
    List<Bloc> findAllByOrderByNomBlocAsc();
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc,long capacityBloc);
    List<Bloc> findBlocByFoyer(Foyer foyer);
    List<Bloc>  findBlocByFoyerUniversiteAndFoyer(Universite universite, Foyer foyer);
    Bloc affecterChambresABloc(List<Integer> numChambre,String nomBloc);
    Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer);

}
