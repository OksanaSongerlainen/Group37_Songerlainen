package Lesson_8_2;

public class Main {
    /*    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать функцию подсчета площади для
    каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы). Создать массив из 5 разных фигур.
    Вывести на экран сумму периметра всех фигур в массиве*/
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle("Треугольник", 2, 3, 4);
        figures[1] = new Rectangle("Прямоугольник", 5, 2);
        figures[2] = new Circle("Круг большой", 9);
        figures[3] = new Circle("Круг малый", 3);
        figures[4] = new Triangle("Треугольник большой", 7, 12, 18);

        double totalPerimeters = 0;
        for (Figure figure : figures) {
            String figureName = figure.getName();
            double figureArea = figure.calcArea();
            double figurePerimeter = figure.calcPerimeter();


            String formattedArea = String.format("%.2f", figureArea);
            String formattedPerimeter = String.format("%.2f", figurePerimeter);
            System.out.println("Фигура: " + figureName + "\nПлощадь: " + formattedArea + "\nПериметр: "
                    + formattedPerimeter + "\n");


            totalPerimeters = totalPerimeters + figurePerimeter;
        }

            String formattedTotalPerimeters = String.format("%.2f", totalPerimeters);
            System.out.println("Сумма периметров всех фигур в массиве: " + formattedTotalPerimeters);
        }
    }

