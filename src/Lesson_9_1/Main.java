package Lesson_9_1;

public class Main {
    /*Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию. Метод eat может принимать “Meat”, “Grass” и другие строки*/
    public static void main(String[] args) {
        Animal dog = new Dog("Собака");
        Animal tiger = new Tiger("Тигр");
        Animal rabbit = new Rabbit("Кролик");

        System.out.println("Собака: ");
        dog.voice();
        dog.eat();

        System.out.println("Тигр: ");
        tiger.voice();
        tiger.eat();

        System.out.println("Кролик: ");
        rabbit.voice();
        rabbit.eat();
    }
}
