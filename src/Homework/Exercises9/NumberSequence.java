package Homework.Exercises9;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n  ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (minNumber > number){
                minNumber = number;
            }
            if (maxNumber < number){
                maxNumber = number;
            }

        }

        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
