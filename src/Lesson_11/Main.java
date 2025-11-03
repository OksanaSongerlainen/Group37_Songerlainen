package Lesson_11;

import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) {
        /*Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        найденные строки и их длину*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        System.out.println("Строка 1: \"" + str1 + "\"");
        System.out.println("Длина: " + str1.length());


        System.out.println("Строка 2: \"" + str2 + "\"");
        System.out.println("Длина: " + str2.length());

        System.out.println("Строка 3: \"" + str3 + "\"");
        System.out.println("Длина: " + str3.length());
        String shortest = str1;
        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        String longest = str1;
        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }
        System.out.println("Самая короткая строка: \"" + shortest + "\"");
        System.out.println("Самая длинная строка: \"" + longest + "\"");


        /*Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины*/
        String[] strings = {str1, str2, str3};
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        System.out.println("\nСтроки в порядке возрастания длины:");
        for (int i = 0; i < strings.length; i++) {
            System.out.println((i + 1) + ". \"" + strings[i] + "\" (длина: " + strings[i].length() + ")");
        }

       /* Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        средней, а также их длину*/
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        double averageLength = totalLength / 3.0;

        System.out.printf("\nСредняя длина строк: %.2f\n", averageLength);

        System.out.println("Строки с длиной меньше средней:");
        boolean found = false;
        for (String str : strings) {
            if (str.length() < averageLength) {
                System.out.println("- \"" + str + "\" (длина: " + str.length() + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет строк с длиной меньше средней");
        }

      /*  Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них*/

        System.out.println("\nПоиск строки с уникальными символами:");
        String uniqueCharString = findFirstUniqueCharString(str1, str2, str3);

        if (uniqueCharString != null) {
            System.out.println("Первая строка с уникальными символами: \"" + uniqueCharString + "\"");
            System.out.println("Длина: " + uniqueCharString.length());
        } else {
            System.out.println("Нет строк, состоящих только из уникальных символов");

        }
    }

    private static boolean hasAllUniqueChars(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    private static String findFirstUniqueCharString(String str1, String str2, String str3) {
        if (hasAllUniqueChars(str1)) {
            return str1;
        }
        if (hasAllUniqueChars(str2)) {
            return str2;
        }
        if (hasAllUniqueChars(str3)) {
            return str3;
        }
        return null;
    }
}


