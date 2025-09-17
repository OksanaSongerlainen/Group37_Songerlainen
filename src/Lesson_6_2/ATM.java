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

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной!");
            return false;
        }
        int total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        if (amount > total) {
            System.out.println("Недостаточно средств в банкомате.");
            return false;
        }
        for (int qtyBanknote100 = Math.min(banknote100, amount / 100); qtyBanknote100 >= 0; qtyBanknote100--) {
            int balance100 = amount - qtyBanknote100 * 100 ;
            for (int qtyBanknote50 = Math.min(banknote50, balance100 / 50); qtyBanknote50 >= 0; qtyBanknote50--) {
                int balance50 = balance100 - qtyBanknote50 * 50;
                if (balance50 >= 0 && balance50 % 20 == 0) {

                    int balance20 = balance50 / 20;
                    if (balance20 <= banknote20) {
                        banknote100 = banknote100 - qtyBanknote100;
                        banknote50 = banknote50 - qtyBanknote50;
                        banknote20 = banknote20 - qtyBanknote20;
                        return true;
                    }
                }
            }
        }
    }
}
