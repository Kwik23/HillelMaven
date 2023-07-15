package hw22Factory;

class FurnitureFactory {
    public Furniture createFurniture(String type) {
        if (type.equalsIgnoreCase("table")) {
            return new Table();
        } else if (type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else {
            throw new IllegalArgumentException("Invalid furniture type.");
        }
    }
}
