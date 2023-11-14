package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;
    @GetMapping("findAllUniversite")
    List<Universite> findAllU(){
        return iUniversiteService.findAll();
    }

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return iUniversiteService.addUniversite(u);
    }

    @DeleteMapping("/deleteUniversite")
    public void delete(@RequestBody Universite u) {
        iUniversiteService.Delete(u);
    }

    @DeleteMapping("/deleteByIdUniversite/{id}")
    public void deleteByIdU(@PathVariable Long id) {
        iUniversiteService.deleteById(id);
    }

    @PutMapping("/editUniversite")
    public Universite editUniversite(@RequestBody Universite u) {
        return iUniversiteService.editUniversite(u);
    }

}

