package Lesson_10_2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Создать программу для реализации поверхностного и глубокого клонирования объекта
        класса User. Пусть на вход программе будет передаваться тип операции клонирования
                (поверхностное клонирование или глубокое), а также id юзера для клонирования.*/
        String[] email = {"1234@mail.ru", "qwerty@gmail.com"};
        User original = new User(1, "Alice", email);
        System.out.println("Original: " + original);

        User shallowCopy = (User) original.clone();
        System.out.println("Shallow copy: " + shallowCopy);

        User deepCopy = original.deepClone();
        System.out.println("Deep copy: " + deepCopy);
    }
}
