package Lesson_5;

import java.util.Random;

public class test_5 {
    public static void main(String[] args) {
        int[][] numbers = new int[5] [5];
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        for (int i=0; i< numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = random.nextInt(0,30);
                maxValue = Math.max(numbers[i][j], maxValue);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
