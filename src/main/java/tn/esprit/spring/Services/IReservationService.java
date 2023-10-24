package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);
    List<Reservation> addAll(List<Reservation> reservations);
    Reservation editFoyer(Reservation r);
    List<Reservation> findAll();
    Reservation findById(String id);
    void deleteById(String id);
    void Delete(Reservation r);
}
