package Lesson_10_1;

public class Main {
    public static void main(String[] args) {
       /* Создать класс для описания пользователя системы. Переопределить в классе методы
        toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
        значением полей и сравнить с помощью метода equals*/
    User user = new User("Иван Иванов", "123456@mail.ru", 30);
        System.out.println(user);
        User user2 = new User("Иван Иванов", "123456@mail.ru", 30);
        System.out.println(user2);
        System.out.println(user == user2);
        System.out.println(user.equals(user2));
    }

}
