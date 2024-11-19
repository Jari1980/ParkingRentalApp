package org.example.Model;

public enum VehicleType {
    CAR(1),
    MOTORCYCLE(2),
    ELECTRIC(3);

    private int code;

    VehicleType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
