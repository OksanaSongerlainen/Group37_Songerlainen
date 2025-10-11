package Lesson_9_1;

 public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " Гав-гав");
    }

    @Override
    public void eat(String food) {
        if ("Meat". equals(food)) {
            System.out.println("Собака ест " + food);
        } else if ("Grass".equals(food)){
            System.out.println("Собака не есть " + food);
        }else {
            System.out.println("Собака сама решит " + food);
        }
    }
}
