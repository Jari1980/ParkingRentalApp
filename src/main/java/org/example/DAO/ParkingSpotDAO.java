package org.example.DAO;

import org.example.Model.ParkingSpot;

import java.util.Collection;

public interface ParkingSpotDAO {
    ParkingSpot createParkingSpot(ParkingSpot parkingSpot);
    ParkingSpot findBySpotNumber(int id);
    boolean removeParkingSpotById(int id);
    Collection<ParkingSpot> findAll();
    Collection<ParkingSpot> findByAreaCode(int areaCode);
    void occupy();
    void vacate();
}
