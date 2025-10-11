package Lesson_9_1;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " издает звук: ррррр");
    }

    @Override
    public void eat(String food) {
        if ("Meat". equals(food)) {
            System.out.println(getName() + " ест " + food);
        } else if ("Grass".equals(food)){
            System.out.println(getName() + " не ест " + food);
        }else {
            System.out.println(getName() + " возможно ест " + food);
        }
    }
}
