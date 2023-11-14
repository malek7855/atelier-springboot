package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc,Long> {

    Bloc findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(long capacityBloc);
    List<Bloc> findByCapaciteBlocAndNomBloc(long capacityBloc,String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(long capacityBloc);
    List<Bloc> findByNomBlocContaining(String sousChaine);
    List<Bloc> findAllByOrderByNomBlocAsc();
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc,long capacityBloc);
    List<Bloc> findBlocByFoyerIdFoyer(long id);
    List<Bloc> findByFoyerUniversite(Universite universite);
    Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer);



}
