package Lesson_8_2;

public abstract class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();

    public String getName() {
        return name;
    }
}
