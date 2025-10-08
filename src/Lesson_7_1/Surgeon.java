package Lesson_7_1;

public class Surgeon extends Doctor{
    public Surgeon () {
        super("Хирург");
    }
    public void treat() {
        System.out.println("Операция");
    }
}
