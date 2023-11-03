package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.spring.DAO.Entities.Chambre;

import java.util.Date;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    //Recherche par numéro de chambre
//Chambre findByNumeroChambre(long idchambre);
//Récupérer les chambres en filtrant par le nom de l'université associée au foyer,
// l'année de réservation et le nom de l'étudiant
//List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneeUniversitaireAndReservationsEtudiantsNomET(String nomuniversite, Date anneeuniversite,String nomEt);

    @Query("select c from Chambre c where c.numeroChambre=?1")
    List<Chambre> selectByNum(long num);

    @Query("select c from Chambre c where c.numeroChambre=:num")
    List<Chambre> selectByNum2(long num);

    @Query(value = "select * from chambre where numeroChambre=?1",nativeQuery = true)
    List<Chambre> selectByNumSQL(long num);

}
