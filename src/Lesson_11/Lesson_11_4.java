package Lesson_11;

import java.util.Scanner;

public class Lesson_11_4 {
   /* Задача *:
    Дана строка произвольной длины с произвольными словами. Написать программу для
    проверки является ли любое выбранное слово в строке палиндромом.
            Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
    слово в этой строке палиндромом.
    Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
    в строке 5 слов, а на вход программе передали число 500*/
   public static void main(String[] args) {

               Scanner scanner = new Scanner(System.in);

               System.out.println("Введите строку: ");
               String inputString = scanner.nextLine();

               System.out.println("Введите номер слова для проверки на палиндром: ");
               int wordNumber = scanner.nextInt();

                 checkWordPalindrome(inputString, wordNumber);

               scanner.close();
           }

           public static void checkWordPalindrome(String text, int wordIndex) {
               // Проверка на пустую строку
               if (text == null || text.trim().isEmpty()) {
                   System.out.println("Ошибка: строка пустая!");
                   return;
               }

               // Проверка на корректный номер слова
               if (wordIndex <= 0) {
                   System.out.println("Ошибка: номер слова должен быть положительным числом!");
                   return;
               }

               // Разбиваем строку на слова
               String[] words = text.split("\\s+");

               // Проверка существования слова с таким номером
               if (wordIndex > words.length) {
                   System.out.println("Ошибка: в строке только " + words.length + " слов(а), а вы ввели " + wordIndex + "!");
                   return;
               }

               // Получаем выбранное слово (индекс -1, так как пользователь вводит с 1)
               String selectedWord = words[wordIndex - 1];

               // Проверка на палиндром
               if (isPalindrome(selectedWord)) {
                   System.out.println("Слово №" + wordIndex + " \"" + selectedWord + "\" является палиндромом!");
               } else {
                   System.out.println("Слово №" + wordIndex + " \"" + selectedWord + "\" НЕ является палиндромом.");
               }
           }

           // Метод для проверки, является ли слово палиндромом
           private static boolean isPalindrome(String word) {
               if (word == null || word.length() <= 1) {
                   return true;
               }

               // Приводим к нижнему регистру для регистронезависимой проверки
               String cleanWord = word.toLowerCase();
               int left = 0;
               int right = cleanWord.length() - 1;

               while (left < right) {
                   if (cleanWord.charAt(left) != cleanWord.charAt(right)) {
                       return false;
                   }
                   left++;
                   right--;
               }

               return true;
           }
       }

