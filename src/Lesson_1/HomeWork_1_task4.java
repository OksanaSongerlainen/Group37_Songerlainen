package Lesson_1;

public class HomeWork_1_task4 {
    public static void main(String[] args) {
        // В переменной n хранится вещественное число с ненулевой дробной частью.
        // Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
       double n = 6.24;
       long rounded = (Math.round(n));
        System.out.println("Округленное число: " + rounded);
    }
}

