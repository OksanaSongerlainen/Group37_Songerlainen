package Lesson_7;

public class Doctor {
protected String specialisation;
public Doctor(String specialisation){
    this.specialisation = specialisation;
}
public void treat() {
    System.out.println("Лечение: ");
}
public String getSpecialisation() {
    return specialisation;
}
}
