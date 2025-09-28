package Lesson_7;

public class Surgeon extends Doctor{
    public Surgeon () {
        super("Хирург");
    }
    public void treat() {
        System.out.println("Операция");
    }
}
