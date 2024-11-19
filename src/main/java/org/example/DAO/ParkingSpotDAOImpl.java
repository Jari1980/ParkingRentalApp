package org.example.DAO;

import org.example.Model.Customer;
import org.example.Model.ParkingSpot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ParkingSpotDAOImpl implements ParkingSpotDAO{
    private Collection<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpotDAOImpl() {
    }

    @Override
    public ParkingSpot createParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot = new ParkingSpot(parkingSpot.getSpotNumber(), parkingSpot.isOccupied(), parkingSpot.getAreaCode());
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    @Override
    public ParkingSpot findBySpotNumber(int id) {
        for(ParkingSpot ele : parkingSpots){
            if(ele.getSpotNumber() == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public void removeParkingSpotById(int id) {
        //parkingSpots.removeIf(parkingSpot -> parkingSpot.getSpotNumber() == id);
        for(ParkingSpot ele : parkingSpots){
            if(ele.getSpotNumber() == id){
                parkingSpots.remove(ele);
            }
        }
    }

    @Override
    public Collection<ParkingSpot> findAll() {
        return parkingSpots;
    }

    @Override
    public Collection<ParkingSpot> findByAreaCode(int areaCode) {
        Collection<ParkingSpot> result = new ArrayList<>();
        for(ParkingSpot ele : parkingSpots){
            if(ele.getAreaCode() == areaCode){
                result.add(ele);
            }
        }
        return result;
    }

    @Override
    public void occupy() {

    }

    @Override
    public void vacate() {

    }
}
