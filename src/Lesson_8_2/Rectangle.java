package Lesson_8_2;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
