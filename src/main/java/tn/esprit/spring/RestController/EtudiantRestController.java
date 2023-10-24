package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor

public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("findAllEtudiant")
    List<Etudiant> findAll(){
        return iEtudiantService.findAll();
    }
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return iEtudiantService.addEtudiant(e);
    }

    @DeleteMapping("/deleteEtudiant")
    public void delete(@RequestBody Etudiant e) {
        iEtudiantService.Delete(e);
    }

    @DeleteMapping("/deleteByIdEtudiant/{id}")
    public void deleteByIdE(@PathVariable Long id) {
        iEtudiantService.deleteById(id);
    }

    @PutMapping("/editEtudiant")
    public Etudiant editEtudiant(@RequestBody Etudiant e) {
        return iEtudiantService.editEtudiant(e);
    }

}
