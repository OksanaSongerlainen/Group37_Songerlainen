package Lesson_9_1;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " Ррррр");
    }

    @Override
    public void eat(String food) {
        if ("Meat". equals(food)) {
            System.out.println("Тигр ест " + food);
        } else if ("Grass".equals(food)){
            System.out.println("Тигр не есть " + food);
        }else {
            System.out.println("Тигр сам решит " + food);
        }
    }
}
