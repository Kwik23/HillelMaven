package hw19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

public class BookServiceTest {
    @Test
    public void testGetFilteredBookProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Book", 300, true, LocalDate.now()));
        productList.add(new Product(2, "Book", 200, true, LocalDate.now()));
        productList.add(new Product(3, "Phone", 500, false, LocalDate.now()));
        productList.add(new Product(4, "Book", 400, true, LocalDate.now()));
        productList.add(new Product(5, "Book", 150, false, LocalDate.now()));
        BookService bookService = new BookService();
        List<Product> filteredProducts = bookService.getFilteredBookProducts(productList);
        Assertions.assertEquals(2, filteredProducts.size());
        Assertions.assertEquals("Book", filteredProducts.get(0).getType());
        Assertions.assertEquals(300, filteredProducts.get(0).getPrice());
        Assertions.assertEquals("Book", filteredProducts.get(1).getType());
        Assertions.assertEquals(400, filteredProducts.get(1).getPrice());
    }

    @Test
    public void testGetDiscountedBookProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Book", 300, true, LocalDate.now()));
        productList.add(new Product(2, "Book", 200, true, LocalDate.now()));
        productList.add(new Product(3, "Phone", 500, false, LocalDate.now()));
        productList.add(new Product(4, "Book", 400, true, LocalDate.now()));
        productList.add(new Product(5, "Book", 150, false, LocalDate.now()));
        BookService bookService = new BookService();
        List<Product> discountedProducts = bookService.getDiscountedBookProducts(productList);
        Assertions.assertEquals(3, discountedProducts.size());
        Assertions.assertEquals("Book", discountedProducts.get(0).getType());
        Assertions.assertEquals(270, discountedProducts.get(0).getPrice());
        Assertions.assertEquals("Book", discountedProducts.get(1).getType());
        Assertions.assertEquals(180, discountedProducts.get(1).getPrice());
        Assertions.assertEquals("Book", discountedProducts.get(2).getType());
        Assertions.assertEquals(360, discountedProducts.get(2).getPrice());
    }

    @Test
    public void testGetCheapestBookProduct() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Phone", 500, false, LocalDate.now()));
        productList.add(new Product(2, "Laptop", 1000, true, LocalDate.now()));
        BookService bookService = new BookService();
        Assertions.assertThrows(RuntimeException.class, () -> {
            bookService.getCheapestBookProduct(productList);
        }, "Продукт [категорія: Book] не знайдено");
    }

    @Test
    public void testGetLastThreeAddedProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Book", 100, true, LocalDate.of(2023, 6, 1)));
        productList.add(new Product(2, "Book", 200, true, LocalDate.of(2023, 6, 3)));
        productList.add(new Product(3, "Book", 300, true, LocalDate.of(2023, 6, 2)));
        productList.add(new Product(4, "Phone", 500, false, LocalDate.of(2023, 6, 4)));
        productList.add(new Product(5, "Book", 400, true, LocalDate.of(2023, 6, 5)));
        BookService bookService = new BookService();
        List<Product> lastThreeAddedProducts = bookService.getLastThreeAddedProducts(productList);
        Assertions.assertEquals(3, lastThreeAddedProducts.size());
        Assertions.assertEquals(400, lastThreeAddedProducts.get(0).getPrice());
        Assertions.assertEquals(500, lastThreeAddedProducts.get(1).getPrice());
        Assertions.assertEquals(200, lastThreeAddedProducts.get(2).getPrice());
    }

    @Test
    public void testCalculateTotalCostOfBooks() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Book", 50, true, LocalDate.of(2023, 6, 1)));
        productList.add(new Product(2, "Book", 100, true, LocalDate.of(2023, 6, 3)));
        productList.add(new Product(3, "Book", 75, true, LocalDate.of(2023, 6, 2)));
        productList.add(new Product(4, "Phone", 200, false, LocalDate.of(2023, 6, 4)));
        productList.add(new Product(5, "Book", 80, true, LocalDate.of(2022, 6, 5)));
        BookService bookService = new BookService();
        double totalCost = bookService.calculateTotalCostOfBooks(productList);
        Assertions.assertEquals(125, totalCost);
    }

    @Test
    public void testGroupProductsByType() {
        List<Product> productList = Arrays.asList(
                new Product(1, "Book", 50, true, null),
                new Product(2, "Toy", 100, false, null),
                new Product(3, "Book", 75, true, null),
                new Product(4, "Toy", 200, false, null),
                new Product(5, "Book", 80, true, null)
        );
        BookService bookService = new BookService();
        Map<String, List<Product>> groupedProducts = bookService.groupProductsByType(productList);
        Assertions.assertEquals(2, groupedProducts.size());
        Assertions.assertEquals(3, groupedProducts.get("Book").size());
        Assertions.assertEquals(2, groupedProducts.get("Toy").size());
    }
}






























