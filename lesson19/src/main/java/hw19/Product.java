package hw19;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discountApplicable;
    private LocalDate dateAdded;

        public Product(int id, String type, double price, boolean discountApplicable, LocalDate dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountApplicable = discountApplicable;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountApplicable() {
        return discountApplicable;
    }

    public void setDiscountApplicable(boolean discountApplicable) {
        this.discountApplicable = discountApplicable;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
}














