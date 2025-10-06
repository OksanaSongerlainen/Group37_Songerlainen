package Lesson_8_2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
public double calcPerimeter() {
    return sideA + sideB + sideC;
}

public double calcArea() {
    double p = calcPerimeter() / 2;
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
}

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}

