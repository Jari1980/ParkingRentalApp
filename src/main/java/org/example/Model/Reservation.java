package org.example.Model;

import org.example.DAO.CustomerDAO;

import java.time.LocalTime;

public class Reservation {
    private int id;
    private LocalTime startTime;
    private LocalTime endTime;
    private CustomerDAO customerDAO;
    private Vehicle associatedVehicle;
    private ParkingSpot parkingSpot;

    public Reservation(int id, LocalTime startTime, LocalTime endTime, CustomerDAO customerDAO, Vehicle associatedVehicle, ParkingSpot parkingSpot) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.customerDAO = customerDAO;
        this.associatedVehicle = associatedVehicle;
        this.parkingSpot = parkingSpot;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public void setCustomer(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    public void setAssociatedVehicle(Vehicle associatedVehicle) {
        this.associatedVehicle = associatedVehicle;
    }
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getId() {
        return id;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public CustomerDAO getCustomer() {
        return customerDAO;
    }
    public Vehicle getAssociatedVehicle() {
        return associatedVehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
