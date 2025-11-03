package Lesson_11;

import java.util.Scanner;

public class Lesson_11_2 {
    public static void main(String[] args) {

    /*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
    Если таких слов несколько, найти первое из них*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        String uniqueCharString = findFirstUniqueCharString(str1, str2, str3);

        if (uniqueCharString != null) {
            System.out.println("Первая строка с уникальными символами: \"" + uniqueCharString + "\"");
            System.out.println("Длина: " + uniqueCharString.length());
        } else {
            System.out.println("Нет строк, состоящих только из уникальных символов");
        }

        scanner.close();
    }
    private static boolean hasAllUniqueChars(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
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

