package org.example.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class VehicleTypeTest {

    @Test
    void getVehicleType(){
        //Arrange
        int code = 1;
        //Act
        VehicleType vehicleType = VehicleType.getVehicleType(code);
        //Assert
        assertEquals(VehicleType.CAR, vehicleType);
    }

    @Test
    void getVehicleTypeUnsuccesful(){
        //Arrange
        int code = 12000;
        //Act,Assert
        assertThrowsExactly(EnumConstantNotPresentException.class, () -> {
            VehicleType.getVehicleType(code);
        });
    }
}
