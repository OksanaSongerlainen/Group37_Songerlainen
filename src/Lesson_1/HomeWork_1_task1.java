package Lesson_1;

import static java.lang.System.out;

public class HomeWork_1_task1 {
    public static void main(String[] args) {
        //Написать приложение, которое будет вычислять и выводить значение по формуле:
        //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
                int b = 15;
                int c = 7;
                int a = 4*(b+c-1)/2;
                out.println("При b = " + b + " и c = " + c);
                out.println("Результат вычислении формулы a=4*(b+c-1)/2 будет равен: " + a);
    }
}
