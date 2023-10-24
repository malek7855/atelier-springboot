package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;

import java.util.List;
import java.util.Set;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    List<Foyer> findFoyerByBloc(Bloc bloc);
    List<Foyer> findByBlocAndIdFoyer(Bloc bloc,Long idfoyer);
}
