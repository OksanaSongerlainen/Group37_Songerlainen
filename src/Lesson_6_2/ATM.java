package Lesson_6_2;

public class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addMoney(int banknote20, int banknote50, int banknote100) {
        if (banknote20 < 0 || banknote50 < 0 || banknote100 < 0) {
            System.out.println("Количество внесенных купюр должно быть положительным!");
            return;
        } else if (banknote20 == 0 && banknote50 == 0 && banknote100 == 0) {
            System.out.println("Вы не внесли ничего!");
            return;
        } else {
            this.banknote20 = this.banknote20 + banknote20;
            this.banknote50 = this.banknote50 + banknote50;
            this.banknote100 = this.banknote100 + banknote100;
            System.out.println("Деньги успешно внесены!");
        }
    }

    /*public boolean withdraw (int amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной!");
            return false;
        }
        int total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        if (amount > total) {
            System.out.println("Недостаточно средств в банкомате.");
            return false;*/
        }



