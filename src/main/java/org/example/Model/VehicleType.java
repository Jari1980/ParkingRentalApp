package org.example.Model;

public enum VehicleType {
    CAR(1, "Car"),
    MOTORCYCLE(2, "Motorcycle"),
    ELECTRIC(3, "Electric");

    private final int code;
    private final String name;

    VehicleType(int code, String name) {
        this.code = code; this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static VehicleType getVehicleType(int code){
        for(VehicleType element : VehicleType.values()){
            if(element.code == code){
                return element;
            }
        }
        throw new EnumConstantNotPresentException(VehicleType.class, String.valueOf(code));
    }
}
