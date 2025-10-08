package Lesson_8_1;

public class Main {
    public static void main(String[] args) {
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();
        System.out.println("Должности в компании: ");
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
