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

        System.out.println( "Строка 1: \"" + str1 + "\"");
        System.out.println("Длина: " + str1.length());

        System.out.println( "Строка 2: \"" + str2 + "\"");
        System.out.println("Длина: " + str2.length());

        System.out.println( "Строка 3: \"" + str3 + "\"");
        System.out.println("Длина: " + str3.length());
    }
}
