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

    public void addMoney(int add20, int add50, int add100) {
        if (add20 < 0 || add50 < 0 || add100 < 0) {
            System.out.println("Количество внесенных купюр не может быть отрицательным");
            return;
        }

        banknote20 = banknote20 + add20;
        banknote50 = banknote50 + add50;
        banknote100 = banknote100 + add100;

        System.out.println("Добавлено в банкомат:");
        System.out.println("Купюр номиналом 20: " + add20);
        System.out.println("Купюр номиналом 50: " + add50);
        System.out.println("Купюр номиналом 100: " + add100);

        int totalAdded = add20 * 20 + add50 * 50 + add100 * 100;
        System.out.println("Общая добавленная сумма: " + totalAdded + " рублей");
    }
}
