package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.Services.IChambreService;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor

public class ChambreRestController {
    IChambreService iChambreService;
    @GetMapping("findAllChambers")
    List<Chambre> findAll(){
        return iChambreService.findAll();
    }
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }

    @DeleteMapping("/deleteChambre")
    public void delete(@RequestBody Chambre c) {
        iChambreService.Delete(c);
    }

    @DeleteMapping("/deleteChamberById/{id}")
    public void deleteById(@PathVariable Long id) {
        iChambreService.deleteById(id);
    }
    @PutMapping("/editChamber")
    public Chambre editChambre(@RequestBody Chambre c) {
        return iChambreService.editChambre(c);
    }
  //  @PostMapping("/findChambreByNumeroChambre")
    //List<Chambre> addChambre(@RequestBody Map<Object,Object> request){
     //   Integer id = (Integer) request.get("numeroChambre");
      //  return iChambreService.findByNumeroChambre(id);
    //}
}
