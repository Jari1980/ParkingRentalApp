package org.example.DAO;

import org.example.Counters.VehicleCounter;
import org.example.Model.Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAO{

    private Collection<Vehicle> vehicleList = new ArrayList<>();

    private static VehicleDAOImpl instance;
    public static VehicleDAOImpl getInstance(){
        if(instance == null){
            instance = new VehicleDAOImpl();
        }
        return instance;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle); //Not using vehicle counter
        return vehicle;
    }

    @Override
    public Vehicle findByPlate(String plate) {
        for(Vehicle ele : vehicleList){
            if(ele.getLicensePlate().equals(plate)){
                return ele;
            }
        }
        return null;
    }

    @Override
    public boolean removeVehicleByPlate(String plate) {
        for(Vehicle ele : vehicleList){
            if(ele.getLicensePlate().equals(plate)){
                return  vehicleList.remove(ele);
            }
        }
        return false;
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        for(Vehicle ele : vehicleList){
            if(ele.getLicensePlate().equals(vehicle.getLicensePlate())){
                ele.setVehicleType(vehicle.getVehicleType());
                return ele;
            }
        }
        return null;
    }

    @Override
    public Collection<Vehicle> findAll() {
        return vehicleList;
    }
}
