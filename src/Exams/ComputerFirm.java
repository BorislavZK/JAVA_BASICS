package Exams;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int rating = 0;
        double percent = 0;
        double totalSales = 0;
        double totalRating = 0;


        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scan.nextLine());

            rating = number % 10;
            number /= 10;


            if (rating == 2) {
                percent = 0;
            } else if (rating == 3) {
                percent = 0.5;
            } else if (rating == 4) {
                percent = 0.7;
            } else if (rating == 5) {
                percent = 0.85;
            } else if (rating == 6) {
                percent = 1;
            }

            totalRating += rating;

            double sales = number * percent;
            totalSales += sales;

        }


        System.out.printf("%.2f\n", totalSales);
        System.out.printf("%.2f", totalRating / n);



    }
}
