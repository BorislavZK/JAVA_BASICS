package Homework.ExamPreparation;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double naDve = 0;
        double naTri = 0;
        double naChetiri = 0;


        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scan.nextLine());

            if (number % 2 == 0) {
                naDve++;
            }

            if (number % 3 == 0) {
                naTri++;
            }

            if (number % 4 == 0) {
                naChetiri++;
            }


        }

        System.out.printf("%.2f%%\n",(naDve / n) * 100);
        System.out.printf("%.2f%%\n",(naTri / n) * 100);
        System.out.printf("%.2f%%\n",(naChetiri / n) * 100);

    }
}
