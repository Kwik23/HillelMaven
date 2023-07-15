package hw22Strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    public void testRectangleArea() {
        ShapeStrategy rectangle = new RectangleStrategy(4, 5);
        double area = rectangle.calculateArea();
        Assertions.assertEquals(20.0, area);
    }

    @Test
    public void testTriangleArea() {
        ShapeStrategy triangle = new TriangleStrategy(3, 6);
        double area = triangle.calculateArea();
        Assertions.assertEquals(9.0, area);
    }

    @Test
    public void testShapeCalculator() {
        ShapeCalculator calculator = new ShapeCalculator();

        calculator.setStrategy(new RectangleStrategy(4, 5));
        double rectangleArea = calculator.calculateArea();
        Assertions.assertEquals(20.0, rectangleArea);

        calculator.setStrategy(new TriangleStrategy(3, 6));
        double triangleArea = calculator.calculateArea();
        Assertions.assertEquals(9.0, triangleArea);
    }
}

