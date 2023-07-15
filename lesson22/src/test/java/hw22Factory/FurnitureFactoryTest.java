package hw22Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurnitureFactoryTest {
    @Test
    public void testCreateTable() {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Furniture table = furnitureFactory.createFurniture("table");
        Assertions.assertNotNull(table);
        Assertions.assertTrue(table instanceof Table);
    }

    @Test
    public void testCreateChair() {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Furniture chair = furnitureFactory.createFurniture("chair");
        Assertions.assertNotNull(chair);
        Assertions.assertTrue(chair instanceof Chair);
    }

    @Test
    public void testInvalidFurnitureType() {
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Furniture invalidFurniture = furnitureFactory.createFurniture("invalid");
        });
    }
}

