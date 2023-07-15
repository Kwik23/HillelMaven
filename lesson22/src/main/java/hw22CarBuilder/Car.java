package hw22CarBuilder;

class Car {
    private String brand;
    private String model;
    private int year;
    private int horsepower;

    private Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private int horsepower;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.model = this.model;
            car.year = this.year;
            car.horsepower = this.horsepower;
            return car;
        }
    }
}


