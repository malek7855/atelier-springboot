package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;
import tn.esprit.spring.DAO.Repository.ChambreRepository;


import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAll(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre editChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).orElse(Chambre.builder().idChambre(0).numeroChambre(0)
                .typeChambre(TypeChambre.SIMPLE).build());
    }

    @Override
    public void deleteById(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public void Delete(Chambre c) {
        chambreRepository.delete(c);
    }

    //@Override
    //public List<Chambre> findByNumeroChambre(long idchambre) {
      //  return null;
    //}


}
