package Lesson_5;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
  /*      Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль*/
int [][] number = {
        {1,2,5},
        {3,7,4},
        {8,9,0}
};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int addNumber = scanner.nextInt();
        int total = 0;
        System.out.println("Массив после добавления цифры " + addNumber + ":");
        for (int i=0; i<number.length; i++) {
            for (int j=0; j<number[i].length; j++){
                number[i][j] = number [i][j] + addNumber;
                total = total + number[i][j];
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов: " + total);
    }
}
