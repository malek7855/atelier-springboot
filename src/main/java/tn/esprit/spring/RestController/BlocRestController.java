package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.IBlocService;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor

public class BlocRestController {
    IBlocService iBlocService;
    @GetMapping("findAll")
    List<Bloc> findAll(){
        return iBlocService.findAll();
    }
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return iBlocService.addBloc(b);
    }


    @DeleteMapping("/deleteBloc")
    public void delete(@RequestBody Bloc b) {
        iBlocService.Delete(b);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        iBlocService.deleteById(id);
    }
    @PutMapping("/editBloc")
    public Bloc editBloc(@RequestBody Bloc b) {
        return iBlocService.editBloc(b);
    }

    @PostMapping("/findByName")
    List<Bloc> findByNomBloc(@RequestBody Map<String,String> request){
        String nomBloc=request.get("nomBloc");
        return iBlocService.findByNomBloc(nomBloc);
    }
    @PostMapping("/findByCapacite")
    List<Bloc> findByCapaciteBloc(@RequestBody Long capacitebloc){
        System.out.println(capacitebloc);
        return iBlocService.findByCapaciteBloc(capacitebloc);
    }
    @PostMapping("/findByCapaciteAndNom")
    public List<Bloc> findByCapaciteBlocAndNomBloc(@RequestBody Map<Object, Object> request) {
        String nomBloc = (String) request.get("nomBloc");
        Integer capacitebloc = (Integer) request.get("capaciteBloc");
        return iBlocService.findByCapaciteBlocAndNomBloc(capacitebloc, nomBloc);
    }
    @PostMapping("/findByCapaciteBlocsup")
    public List<Bloc> findByCapaciteBlocGreaterThan(@RequestBody Long capacityBloc){
        System.out.println(capacityBloc);
        return iBlocService.findByCapaciteBlocGreaterThan(capacityBloc);
    }
    @PostMapping("/findBlocBySousChaine")
    public List<Bloc> findByNomBlocContaining(@RequestBody Map<Object, Object> request){
        String sousChaine=(String) request.get("sousChaine");
        System.out.println(sousChaine);
        return iBlocService.findByNomBlocContaining(sousChaine);
    }

    @GetMapping("/TriParNomBloc")
    public List<Bloc> findAllByNomBlocOrderByNomBlocAsc(){
        return iBlocService.findAllByOrderByNomBlocAsc();
    }
    @PostMapping("/findBlocByNomBlocOrCapacite")
    public List<Bloc> findByNomBlocOrCapaciteBloc(@RequestBody Map<String , Object> request){
        String nomBloc = (String) request.get("nomBloc");
        Integer capacitebloc = (Integer) request.get("capaciteBloc");
        return iBlocService.findByNomBlocOrCapaciteBloc(nomBloc,capacitebloc);
    }

    @PostMapping("/findBlocByFoyer")
    public List<Bloc> findBlocByFoyer(@RequestBody Foyer foyer){
        return iBlocService.findBlocByFoyer(foyer);
    }
    @PostMapping("/findBlocByFoyerUniversityAndFoyer")
    public List<Bloc> findBlocByFoyerUniversityAndFoyer(@RequestBody Universite universite,Foyer foyer){
        return iBlocService.findBlocByFoyerUniversiteAndFoyer(universite,foyer);
    }
}
