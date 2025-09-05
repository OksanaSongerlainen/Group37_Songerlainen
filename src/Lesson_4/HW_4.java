package Lesson_4;
/*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:*/


import java.util.Arrays;

public class HW_4 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 8);
        }
        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(array));
        System.out.println("\nЭлементы массива: ");
        for (
                int i = 0;
                i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
            /*Задача 1:
            Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
        System.out.println("\nЭлементы массива в обратном порядке:");
        for (
                int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) System.out.print(", ");
        }
            /* Задача 2:
            Найти минимальный-максимальный элементы и вывести в консоль*/
            /*Задача 3:
            Найти индексы минимального и максимального элементов и вывести в консоль*/
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);

            if (array[i] == max) {
                maxIndex = i;
            }
            if (array[i] == min) {
                minIndex = i;
            }
        }
        System.out.println("\n\nМаксимальное значение: " + max + " индекс: " + maxIndex);
        System.out.println("Минимальное значение: " + min + " индекс: " + minIndex);

        /*    Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет*/
        int zeroCount = 0;
        for (int j : array) {
            if (j == 0) {
                zeroCount++;
            }
        }
        System.out.println("\nКоличество нулевых элементов: " + zeroCount);
        if (zeroCount == 0) {
            System.out.println("Нулевых элементов в массиве нет!");
        } else {
            System.out.print("Индексы нулевых элементов: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    System.out.print(i + " ");
                }
            }
        }
/*        Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д*/
        for (int i = 0; i < array.length / 2; i++) {
            int j = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = j;
        }
        System.out.println("\nМассив после смены элементов местами: " + Arrays.toString(array));

/*    Задача 6:
    Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).*/
        boolean increasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                increasing = false;
                break;
            }
        }
        System.out.println("\nПроверка на возрастающую последовательность: ");
        if (increasing) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}



