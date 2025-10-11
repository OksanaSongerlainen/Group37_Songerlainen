package Lesson_9_1;

public abstract class Animal {
    private final String name;
    public void voice(){
        System.out.println( name + " издает звук");
    }
    public void eat() {
        System.out.println(name + " ест");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(String food);
}
