package hw22CarBuilder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2021)
                .setHorsepower(203)
                .build();

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Horsepower: " + car.getHorsepower());
    }
}
