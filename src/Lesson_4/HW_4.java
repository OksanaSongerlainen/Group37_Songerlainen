package Lesson_4;
/*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:*/


import java.util.Arrays;
public class HW_4 {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 7);
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
                    int i = array.length -1; i>=0; i--) {
                System.out.print(array[i]);
                if (i > 0) System.out.print(", ");
            }
            /* Задача 2:
            Найти минимальный-максимальный элементы и вывести в консоль*/
        int max = array[0];
        int min = array[0];
        for (int i=1 ; i <array.length; i++) {
            max = Math.max (max, array[i]);
            min = Math.min (min, array[i]);
        }
        System.out.println("\n\nМаксимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
    /*Задача 3:
    Найти индексы минимального и максимального элементов и вывести в консоль*/

}



