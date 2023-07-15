package hw22Strategy;

public class ShapeCalculator {
    private ShapeStrategy strategy;

    public void setStrategy(ShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        return strategy.calculateArea();
    }
}
