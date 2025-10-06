package Lesson_8;

public class Main {
    public static void main(String[] args) {
        Position director = new Director();
        Position worker = new Worker();
        Position accauntant = new Accountant();
        System.out.println("Должности в компании: ");
        director.printPosition();
        worker.printPosition();
        accauntant.printPosition();
    }
}
