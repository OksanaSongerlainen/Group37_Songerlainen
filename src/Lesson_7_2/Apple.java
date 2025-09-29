package Lesson_7_2;

public class Apple {
    /*Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple, и не
    используя сеттеры изме  нить значение поля color*/
    private String color = "Зеленый";

    public Apple(String color) {
        this.color = color;
    }
    public Apple() {
    }
    public void printColor() {
        System.out.println("Цвет яблока " + color);
    }
}
