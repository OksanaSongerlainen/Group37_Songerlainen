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
        System.out.println("ВОЗМОЖНЫЕ ВАРИАНТЫ ВЫДАЧИ " + amount + " рублей");
        boolean found = false;
        int option = 1;
        int selected20 = 0, selected50 = 0, selected100 = 0;

        for (int qtyBanknote100 = Math.min(banknote100, amount / 100); qtyBanknote100 >= 0; qtyBanknote100--) {
            int balance100 = amount - qtyBanknote100 * 100;
            for (int qtyBanknote50 = Math.min(banknote50, balance100 / 50); qtyBanknote50 >= 0; qtyBanknote50--) {
                int balance50 = balance100 - qtyBanknote50 * 50;
                if (balance50 >= 0 && balance50 % 20 == 0) {
                    int qtyBanknote20 = balance50 / 20;
                    if (qtyBanknote20 <= banknote20) {
                        System.out.println("Вариант " + option + ":");
                        System.out.println("  • 100: " + qtyBanknote100 + " купюр");
                        System.out.println("  • 50: " + qtyBanknote50 + " купюр");
                        System.out.println("  • 20: " + qtyBanknote20 + " купюр");
                        System.out.println("  • Всего купюр: " + (qtyBanknote20 + qtyBanknote50 + qtyBanknote100));
                        System.out.println();

                    if (!found) {
                        selected20 = qtyBanknote20;
                        selected50 = qtyBanknote50;
                        selected100 = qtyBanknote100;
                    }

                        found = true;
                        option++;
                                                }
                    }
                }
            }
        if (!found) {
        System.out.println("Невозможно выдать сумму " + amount + " доступными купюрами");
        return false;
        }
        System.out.println("ВЫДАЕМ ДЕНЬГИ ПО ВАРИАНТУ 1");
        banknote100 = banknote100 - selected100;
        banknote50 = banknote50 - selected50;
        banknote20 = banknote20 - selected20;

        printWithdrawalResult(selected20, selected50, selected100);
        return true;
    }


    void printWithdrawalResult(int qtyBanknote20, int qtyBanknote50, int qtyBanknote100) {
        System.out.println("Выдано: ");
        if (qtyBanknote100 > 0) System.out.println("100: " + qtyBanknote100 + " купюр");
        if (qtyBanknote50 > 0) System.out.println("50: " + qtyBanknote50 + " купюр");
        if (qtyBanknote20 > 0) System.out.println("20: " + qtyBanknote20 + " купюр");
    }
    void showStatus() {
        System.out.println("=== СОСТОЯНИЕ БАНКОМАТА ===");
        System.out.println("Купюр 100: " + banknote100);
        System.out.println("Купюр 50: " + banknote50);
        System.out.println("Купюр 20: " + banknote20);
        System.out.println("Общая сумма: " + (banknote20 * 20 + banknote50 * 50 + banknote100 * 100));
    }
}
