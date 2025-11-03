package Lesson_11;

import java.util.Scanner;

public class Lesson_11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        String doubledString = doubleCharacters(inputString);

        System.out.println("Исходная строка: \"" + inputString + "\"");
        System.out.println("Результат: \"" + doubledString + "\"");

        scanner.close();
    }

    private static String doubleCharacters(String str) {
        if (str == null) return null;
        if (str.isEmpty()) return "";

        // Создаем массив в два раза больше исходной строки
        char[] result = new char[str.length() * 2];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result[i * 2] = c;     // Первое вхождение символа
            result[i * 2 + 1] = c; // Второе вхождение символа
        }

        return new String(result);
    }
}

