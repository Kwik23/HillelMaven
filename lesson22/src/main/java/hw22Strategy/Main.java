package hw22Strategy;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        calculator.setStrategy(new RectangleStrategy(4, 5));
        double rectangleArea = calculator.calculateArea();
        System.out.println("Площа прямокутника: " + rectangleArea);

        calculator.setStrategy(new TriangleStrategy(3, 6));
        double triangleArea = calculator.calculateArea();
        System.out.println("Площа трикутника: " + triangleArea);
    }
}

