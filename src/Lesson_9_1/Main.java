package Lesson_9_1;

public class Main {
    /*Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
    Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию. Метод eat может принимать “Meat”, “Grass” и другие строки*/
    public static void main(String[] args) {
        Animal dog = new Dog("Собака");
        Animal tiger = new Tiger("Тигр");
        Animal rabbit = new Rabbit("Кролик");
String[] foods = {"Meat", "Fish", "Grass", "Bread", "Fruit"};


        System.out.println("Собака: ");
        dog.voice();
        for (String food : foods) {
            dog.eat(food);
        }

        System.out.println("\n Тигр: ");
        tiger.voice();
        for (String food : foods) {
            tiger.eat(food);
        }

        System.out.println("\n Кролик: ");
        rabbit.voice();
        for (String food : foods) {
            rabbit.eat(food);
        }
    }
}
