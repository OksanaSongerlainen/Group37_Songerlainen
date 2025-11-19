package Lesson_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_12_2 {
    /*Программа на вход получает произвольный текст. В этом тексте может быть номер
    документа(один или несколько), емейл и номер телефона. Номер документа в формате:
    xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
    может содержать не всю информацию, т.е. например, может не содержать номер
    телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
    формате:
    email: teachmeskills@gmail.com
    document number: 1423-1512-51*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String email = "[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}";
        String doc = "\\d{4}-\\d{4}-\\d{2}";
        String phone = "\\+\\(\\d{2}\\)\\d{7}";

        boolean foundAny = false;

        Pattern emailPattern = Pattern.compile(email);
        Matcher emaiMatcher = emailPattern.matcher(input);
        while (emaiMatcher.find()) {
            System.out.println("email: " + emaiMatcher.group());
            foundAny = true;
        }

        Pattern documentPattern = Pattern.compile(doc);
        Matcher documentMatcher = documentPattern.matcher(input);
        while (documentMatcher.find()) {
            System.out.println("Document number: " + documentMatcher.group());
            foundAny = true;
        }

        Pattern phonePattern = Pattern.compile(phone);
        Matcher phoneMatcher = phonePattern.matcher(input);
        while (phoneMatcher.find()) {
            System.out.println("Phone number: " + phoneMatcher.group());
            foundAny = true;
        }
        if (!foundAny) {
            System.out.println("Информация не найдена.");
        }
    }
}
