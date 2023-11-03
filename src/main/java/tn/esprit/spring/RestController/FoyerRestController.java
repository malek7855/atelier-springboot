package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.Services.IFoyerService;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;

    @GetMapping("findAllFoyer")
    List<Foyer> findAllF(){
        return iFoyerService.findAll();
    }

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer f){
        return iFoyerService.addFoyer(f);
    }
    @DeleteMapping("/deleteFoyer")
    public void delete(@RequestBody Foyer f) {
        iFoyerService.Delete(f);
    }

    @DeleteMapping("/deleteByIdFoyer/{id}")
    public void deleteByIdF(@PathVariable Long id) {
        iFoyerService.deleteById(id);
    }

    @PutMapping("/editFoyer")
    public Foyer editFoyer(@RequestBody Foyer f) {
        return iFoyerService.editFoyer(f);
    }


}
