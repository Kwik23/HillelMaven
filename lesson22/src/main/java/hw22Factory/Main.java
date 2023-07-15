package hw22Factory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FurnitureFactory();

        Furniture table = furnitureFactory.createFurniture("table");
        table.display();

        Furniture chair = furnitureFactory.createFurniture("chair");
        chair.display();
    }
}
