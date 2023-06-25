package hw19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.Map;

public class BookService {
    public List<Product> getFilteredBookProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getDiscountedBookProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscountApplicable())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    product.setPrice(discountedPrice);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public Product getCheapestBookProduct(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Продукт [категорія: Book] не знайдено"));
    }

    public List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double calculateTotalCostOfBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getDateAdded().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

}


