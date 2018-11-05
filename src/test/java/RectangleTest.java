

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Ensures that it behaves as a rectangle
class RectangleTest {

    @Test
    void shouldCreateARectangle() throws InstantiationException {
        assertNotNull(new Rectangle(1, 1));
    }

    @Test
    void shouldHavePositiveValueSides() {
        Assertions.assertThrows(InstantiationException.class, () -> new Rectangle(0, 1));
        Assertions.assertThrows(InstantiationException.class, () -> new Rectangle(-1, 2));

        Assertions.assertThrows(InstantiationException.class, () -> new Rectangle(1, 0));
        Assertions.assertThrows(InstantiationException.class, () -> new Rectangle(1, -2));
    }

    @Test
    void shouldReturnThePerimeter() throws InstantiationException {
        Rectangle rectangle1by2 = new Rectangle(1, 2);
        Rectangle rectangle2by3 = new Rectangle(2, 3);

        assertEquals(rectangle1by2.getPerimeter(), 6);
        assertEquals(rectangle2by3.getPerimeter(), 10);
    }

    @Test
    void shouldReturnTheArea() throws InstantiationException {
        Rectangle rectangleArea6 = new Rectangle(3, 2);
        Rectangle rectangleArea12 = new Rectangle(4, 3);

        assertEquals(rectangleArea6.getArea(), 6);
        assertEquals(rectangleArea12.getArea(), 12);
    }
}