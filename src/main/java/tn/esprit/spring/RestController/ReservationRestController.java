package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor

public class ReservationRestController {
    IReservationService iReservationService;
    @GetMapping("findAllReservation")
    List<Reservation> findAllR(){
        return iReservationService.findAll();
    }

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r){
        return iReservationService.addReservation(r);
    }

    @DeleteMapping("/deleteReservation")
    public void delete(@RequestBody Reservation r) {
        iReservationService.Delete(r);
    }

    @DeleteMapping("/deleteByIdReservation/{id}")
    public void deleteById(@PathVariable String id) {
        iReservationService.deleteById("");
    }

    @PutMapping("/editReservation")
    public Reservation editReservation(@RequestBody Reservation r) {
        return iReservationService.editFoyer(r);
    }
}
