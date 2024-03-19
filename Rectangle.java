public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea(double length) {
        return length * length;
    }

    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}