// Understands a shape with 4 sides and 4 right angles
public class Rectangle {
    final private double height;
    final private double width;

    public Rectangle(double width, double height) throws InstantiationException {

        if (width <= 0) {
            throw new InstantiationException("Invalid width");
        }

        if (height <= 0) {
            throw new InstantiationException("Invalid height");
        }

        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return height * width;
    }
}
