package Lesson_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_12_1 {
/*    Вывести в консоль из строки которую пользователь вводит с клавиатуры все
    аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
    только из прописных букв, без чисел*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Pattern pattern = Pattern.compile( "[А-ЯA-Z]{2,6}" );
    Matcher matcher = pattern.matcher(input);
    System.out.println("Аббревиатуры: " );
    boolean found = false;

    while (matcher.find()){
        String group = matcher.group();
        System.out.println(group);
        found = true;
    }
    if (!found) {
        System.out.println("Аббревиатуры не найдены.");
    }
   }
}
