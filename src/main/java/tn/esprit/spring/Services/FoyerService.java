package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Repository.FoyerRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> addAll(List<Foyer> foyers) {
        return  foyerRepository.saveAll(foyers);
    }

    @Override
    public Foyer editFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).orElse(Foyer.builder().idFoyer(0).nomFoyer("")
                .capaciteFoyer(0).build());
    }

    @Override
    public void deleteById(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public void Delete(Foyer f) {
        foyerRepository.delete(f);
    }

    @Override
    public List<Foyer> findFoyerByBloc(Bloc bloc) {
        return foyerRepository.findFoyerByBloc(bloc);
    }

    @Override
    public List<Foyer> findByBlocAndIdFoyer(Bloc bloc, Long idfoyer) {
        return foyerRepository.findByBlocAndIdFoyer(bloc,idfoyer);
    }


}
