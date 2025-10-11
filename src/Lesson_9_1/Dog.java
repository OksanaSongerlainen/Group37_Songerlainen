package Lesson_9_1;

 public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " издает звук: гав-гав");
    }

    @Override
    public void eat(String food) {
        if ("Meat". equals(food)) {
            System.out.println(getName() + " с удовольствием ест " + food);
        } else if ("Grass".equals(food)){
            System.out.println(getName() + " недоволен, он не ест " + food);
        }else {
            System.out.println(getName() + " возможно ест " + food);
        }
    }
}
