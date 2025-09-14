package Lesson_6;
/* Задача 1:
       Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
       метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
       который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
       выводит текущую информацию о карточке. Напишите программу, которая создает три
       объекта класса CreditCard у которых заданы номер счета и начальная сумма.
         Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
       третьей. Выведите на экран текущее состояние всех трех карточек.*/

public class CreditCard {
String accountNumber;
double currentBalance;
    public CreditCard(String accountNumber, double currentBalance) {
            this.currentBalance = currentBalance;
            this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для начисления должна быть положительной");
        } else {
            this.currentBalance = this.currentBalance + amount;
            System.out.println("Начислено " + amount + " рублей. Новый баланс " + currentBalance + " рублей.");
        }
    }
    public void  withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для снятия должна быть положительной");
        } if (amount > currentBalance) {
            System.out.println("На счету недостаточно средств для снятия");
        }else {
            this.currentBalance = this.currentBalance - amount;
            System.out.println("Снято " + amount + " рублей. Новый баланс " + currentBalance + " рублей.");
        }
    }
}
