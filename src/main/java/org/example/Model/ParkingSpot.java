package org.example.Model;

public class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private int areaCode;

    public ParkingSpot(int spotNumber, boolean isOccupied, int areaCode) {
        this.spotNumber = spotNumber;
        this.isOccupied = isOccupied;
        this.areaCode = areaCode;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public int getAreaCode() {
        return areaCode;
    }

    public void occupy(){
        isOccupied = true;
    }

    public void vacate(){
        isOccupied = false;
    }
}
