package org.example.DAO;

import org.example.Model.Vehicle;

import java.util.Collection;

public interface VehicleDAO {
    Vehicle createVehicle(Vehicle vehicle);
    Vehicle findByPlate(String plate);
    boolean removeVehicleByPlate(String plate);
    Vehicle updateVehicle(Vehicle vehicle);
    Collection<Vehicle> findAll();
}
