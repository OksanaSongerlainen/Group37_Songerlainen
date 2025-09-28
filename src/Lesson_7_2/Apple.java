package Lesson_7_2;

public class Apple {
    /*Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple, и не
    используя сеттеры изменить значение поля color*/
    private String color = "Зеленый";
    public String getColor(){
        return color;
    }
}
