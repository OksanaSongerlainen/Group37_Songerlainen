package Lesson_5;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
  /*      Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль*/
        int[][] number = {
                {1, 2, 5},
                {3, 7, 4},
                {8, 9, 0}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int addNumber = scanner.nextInt();
        int total = 0;
        System.out.println("Массив после добавления цифры " + addNumber + ":");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = number[i][j] + addNumber;
                total = total + number[i][j];
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов: " + total);
    }
}

class Task2 {
    public static void main(String[] args) {
        /*Задача 2:
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White). При выводе результат работы программы должен быть
        следующим:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
            }
        }
        System.out.println("Шахматная доска: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Task3 {
    public static void main(String[] args) {
 /*   Задача *:
    Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
            Формат входных данных:
    Программа получает на вход два числа n и m.
            Формат выходных данных:
    Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
    символа.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n ");
        int n = scanner.nextInt();
        System.out.println("Введите число m ");
        int m = scanner.nextInt();
        int[][] A = new int[n][m];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = counter++;
                }
            } else {
                for (int j = m - 1; j > 0; j--) {
                    A[i][j] = counter++;
                }
            }
        }
        System.out.println("Массив: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d" , A[i][j]);
            }
            System.out.println();
        }
    }
}