package Lesson_8_3;

public class CloneableExample {
    public static void main(String[] args) {
        /*Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.*/
        // Создаем оригинальный объект
        Person original = new Person("Иван", 25);
        System.out.println("Оригинал: " + original);

        // Клонируем объект
        Person clone = original.clone();
        System.out.println("Клон: " + clone);

        // Проверяем, что это разные объекты
        System.out.println("Это один и тот же объект? " + (original == clone));
        System.out.println("Но с одинаковыми данными? " + original.equals(clone));

        // Меняем данные в клоне
        clone.setName("Петр");
        clone.setAge(30);

        System.out.println("\nПосле изменения клона:");
        System.out.println("Оригинал: " + original);
        System.out.println("Клон: " + clone);
    }
}
