package Lesson_7;

public class Clinic {
  /*  Задача 1:
    Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
    хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
    по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
    терапевта создать метод, который будет назначать врача пациенту согласно плану
    лечения:
    Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
    Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
    Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
    лечить.*/
  public static void main(String[] args) {
      Therapist therapist = new Therapist();
      System.out.println("Пациент 1 ");
      Patient patient1 = new Patient("Оля", 1);
      therapist.doctorsChoice(patient1);
      System.out.println("Пациент 2 ");
      Patient patient2 = new Patient("Саша", 2);
      therapist.doctorsChoice(patient2);
      System.out.println("Пациент 3 ");
      Patient patient3 = new Patient("Катя", 3);
      therapist.doctorsChoice(patient3);
      System.out.println("Пациент 4 ");
      Patient patient4 = new Patient("Алексей", 7);
      therapist.doctorsChoice(patient4);

  }

}
