package Lesson_2;

import java.util.Scanner;

public class HW_2_1 {
    public static void main(String[] args) {

    /*Напишите программу, которая будет принимать на вход число из консоли и на выход
    будет выводить сообщение четное число или нет. Для определения четности числа
    используйте операцию получения остатка от деления (операция выглядит так: '% 2')*/

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner1.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Не четное");
        }
        scanner1.close();
    }
}

/*
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
class HW_2_2 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите температуру на улице");
        int t = scanner2.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scanner2.close();
    }
}

class HW_2_3 {
    /*Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.*/
    public static void main(String[] args) {
        int number3 = 10;
        while (number3 <= 20) {
            System.out.println(number3 + "^2 =" + number3 * number3);
            number3 = number3 + 1;
        }
    }
}

class HW_2_4 {
    /*Необходимо, чтоб программа выводила на экран вот такую последовательность:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
    public static void main(String[] args) {
        int number4 = 7;
        while (number4 <= 98) {
            System.out.print(number4 + " ");
            number4 += 7;
        }
    }
}

class HW_2_5 {
    /*Напишите программу, где пользователь вводит любое целое положительное число. А
    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    ввести некорректные данные.*/
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        if (scanner5.hasNextInt()) {
            int number5 = scanner5.nextInt();
            if (number5 >= 1) {
                int sum = 0;
                for (int a = 1; a <= number5; a++) {
                    sum += a;
                }
                System.out.println("Сумма цифр до " + number5 + " = " + sum);
            } else {
                System.out.println("Ошибка! Число должно быть положительным.");
            }
        } else {
            System.out.println("Ошибка! Число должно быть целым.");
            scanner5.next();
        }
        scanner5.close();
    }
}





