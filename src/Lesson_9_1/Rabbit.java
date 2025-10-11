package Lesson_9_1;

public class Rabbit extends Animal{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " Пи-пи-пи");
    }

    @Override
    public void eat(String food) {
        if ("Meat". equals(food)) {
            System.out.println("Кролик не ест " + food);
        } else if ("Grass".equals(food)){
            System.out.println("Собака ест " + food);
        }else {
            System.out.println("Кролик сам решит " + food);
        }
    }
}
