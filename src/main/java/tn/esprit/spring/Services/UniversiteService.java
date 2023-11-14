package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.DAO.Repository.UniversiteRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> addAll(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public Universite editUniversite(Universite u) {
        return universiteRepository.save(u);
    }


    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).orElse(Universite.builder().idUniversite(0).nomUniversite("")
                .adresse("").build());
    }

    @Override
    public void deleteById(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public void Delete(Universite u) {
        universiteRepository.delete(u);
    }

    @Override
    public Universite findByNomUniversite(String nomUniversite) {
        return universiteRepository.findByNomUniversite(nomUniversite);
    }

}
