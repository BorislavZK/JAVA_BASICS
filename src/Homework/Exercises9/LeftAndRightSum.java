package Homework.Exercises9;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum1 += number;
        }
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum2 += number;
        }

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
