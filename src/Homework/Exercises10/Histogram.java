package Homework.Exercises10;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber < 400) {
                p2++;
            } else if (currentNumber < 600) {
                p3++;
            } else if (currentNumber < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n", (p1 * 1.00) / n * 100);
        System.out.printf("%.2f%%%n", (p2 * 1.00) / n * 100);
        System.out.printf("%.2f%%%n", (p3 * 1.00) / n * 100);
        System.out.printf("%.2f%%%n", (p4 * 1.00) / n * 100);
        System.out.printf("%.2f%%%n", (p5 * 1.00) / n * 100);

    }
}
