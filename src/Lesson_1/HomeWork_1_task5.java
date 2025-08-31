package Lesson_1;

public class HomeWork_1_task5 {
    public static void main(String[] args) {
        //В переменных q и w хранятся два натуральных числа.
        // Создайте программу, выводящую на экран результат деления q на w с остатком.
        // Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
        int q = 13;
        int w = 7;
        int quotient = q / w;
        int remainder = q % w;
        System.out.println(q + " / " + w + " = " + quotient + " и " + remainder + " в остатке");

    }
}
