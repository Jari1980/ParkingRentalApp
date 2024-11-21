package org.example.DAO;

import org.example.Counters.ReservationCounter;
import org.example.Model.Reservation;

import java.util.ArrayList;
import java.util.Collection;

public class ReservationDAOImpl implements ReservationDAO{
    private static ReservationDAOImpl instance;
    private Collection<Reservation> reservationList = new ArrayList<>();

    public static ReservationDAOImpl getInstance(){
        if(instance == null){
            instance = new ReservationDAOImpl();
        }
        return instance;
    }

    @Override
    public Reservation createNewReservation(Reservation reservation) {
        reservationList.add(new Reservation(ReservationCounter.getCounter(), reservation.getStartTime(), reservation.getEndTime(), reservation.getCustomer(), reservation.getAssociatedVehicle(), reservation.getParkingSpot()));
        return reservation;
    }

    @Override
    public Reservation findByReservationId(int id) {
        for(Reservation ele : reservationList){
            if(ele.getId() == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public boolean removeByReservationId(int id) {
        for(Reservation ele : reservationList){
            if(ele.getId() == id){
                return reservationList.remove(ele);
            }
        }
        return false;
    }

    @Override
    public Reservation findByCustomerId(int id) {
        for(Reservation ele : reservationList){
            if(ele.getCustomer().getId() == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public Reservation findByVehicleLicense(String plate) {
        for(Reservation ele : reservationList){
            if(ele.getAssociatedVehicle().getLicensePlate().equals(plate)){
                return ele;
            }
        }
        return null;
    }

    @Override
    public Reservation findByParkingSpotNr(int spot) {
        for(Reservation ele : reservationList){
            if(ele.getParkingSpot().getSpotNumber() == spot){
                return ele;
            }
        }
        return null;
    }
}
