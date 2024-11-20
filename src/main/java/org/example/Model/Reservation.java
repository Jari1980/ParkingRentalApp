package org.example.Model;

import org.example.DAO.CustomerDAO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private int id;
    private LocalDate startTime;
    private LocalDate endTime;
    private Customer customer;
    private Vehicle associatedVehicle;
    private ParkingSpot parkingSpot;

    public Reservation(int id, LocalDate startTime, LocalDate endTime, Customer customer, Vehicle associatedVehicle, ParkingSpot parkingSpot) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.customer = customer;
        this.associatedVehicle = associatedVehicle;
        this.parkingSpot = parkingSpot;
    }

    public boolean extend(int days){
        if(days <= 0){
            return false;
        }
        endTime = endTime.plusDays(days);
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
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
    public LocalDate getStartTime() {
        return startTime;
    }
    public LocalDate getEndTime() {
        return endTime;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Vehicle getAssociatedVehicle() {
        return associatedVehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
