package hw22CarBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarCreation() {
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder.setBrand("Toyota");
        carBuilder.setModel("Camry");
        carBuilder.setYear(2021);
        carBuilder.setHorsepower(203);

        Car car = carBuilder.build();

        Assertions.assertEquals("Toyota", car.getBrand());
        Assertions.assertEquals("Camry", car.getModel());
        Assertions.assertEquals(2021, car.getYear());
        Assertions.assertEquals(203, car.getHorsepower());
    }
}

