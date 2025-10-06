package Lesson_8_2;

public class Circle extends Figure{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calcPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }
}
