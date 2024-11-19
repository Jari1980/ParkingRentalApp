package org.example.Model;

import org.example.DAO.CustomerDAO;

public class Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;
    private CustomerDAO customerDAO;

    public Vehicle(String licensePlate, VehicleType vehicleType, CustomerDAO customerDAO) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.customerDAO = customerDAO;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setCustomer(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public CustomerDAO getCustomer() {
        return customerDAO;
    }
}
