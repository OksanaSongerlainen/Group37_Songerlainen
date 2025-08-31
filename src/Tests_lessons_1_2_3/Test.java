package Tests_lessons_1_2_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Твой возраст?");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("Мой возраст " + age);
        } else {
            System.out.println("Введите цифры");
        }

    }
}

class testIf {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи любое четное число");
        int num = scanner1.nextInt();
        if (num < 15) {
            System.out.println("есс");
        } else {
            System.out.println("нооо");
        }
    }
}

class TestIfIf {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x == 10) {
            if (y == 10) {
                System.out.println("x = 10 и y = 20");
            } else {
                System.out.println("nooo");
            }
        }

    }
}

class Tern {
    public static void main(String[] args) {
        int a = 3526456;
        String result = (a % 2 == 0) ? "бэээ" : "нооо";
        System.out.println(result);
    }
}

class Switch {
    public static void main(String[] args) {
        switch ("Настя") {
            case "Оксана":
                System.out.println("4");
                break;
            case "Настя":
                System.out.println("33");
                break;
            case "FFfff":
                System.out.println("3eeew");
                break;
            default:
                System.out.println("лалалала");
        }
    }
}

class switch2 {
    public static void main(String args[]) {
        //char grade = args[0].charAt(0);
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено");
                break;
            case 'D':
                System.out.println("Вы прошли");
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
}

class switch3 {
    public static void main(String args[]) {
        char grade = 'B';

        switch (grade) {
            case 'A' -> System.out.println("Отлично!");
            case 'B' -> System.out.println("Отлично выполнено");
            case 'C' -> System.out.println("Отлично выполнено");
            case 'D' -> System.out.println("Вы прошли");
            case 'F' -> System.out.println("Лучше попробуйте снова");
            default -> System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
}

class While {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        int num = 0;
        while (num <= 1) {
            System.out.println(num++);
        }

    }
}

class dowhile {
    public static void main(String[] args) {
        int n = 2;
        do {
            System.out.println("Тик " + n--);
        } while (n > 1);
    }
}

class forrr {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class foreach {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        for (String str : fruits) {
            System.out.println("фрукт: " + str);
        }
    }
}

class breake {
    public static void main(String[] args) {
        int i = 0, n = 100;
        while (i < n) {
            if (i == 8) {
                break;
            }
            System.out.println("i: " + i++);
        }
        System.out.println("the end");
    }
}

class continues {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

class returnn {
    public static void main(String[] args) {
        double d = getRandomValue(3);
        System.out.println(d);
    }

    public static double getRandomValue(int i) {
        return Math.random() * i;
    }
    }