package org.example.DAO;

import org.example.Model.Reservation;

public interface ReservationDAO {
    Reservation createNewReservation(Reservation reservation);
    Reservation findByReservationId(int id);
    void removeByReservationId(int id);
    Reservation findByCustomerId(int id);
    Reservation findByVehicleLicense(String plate);
    Reservation findByParkingSpotNr(int spot);
}
