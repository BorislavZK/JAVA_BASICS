package Homework.ExamPreparation;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double total = 0;


        for (int i = 1; i <= n; i++) {

            String series = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());

            if (series.equals("Thrones")) {
                price = price * 0.5;
            } else if (series.equals("Lucifer")) {
                price = price * 0.6;
            } else if (series.equals("Protector")) {
                price = price * 0.7;
            } else if (series.equals("TotalDrama")) {
                price = price * 0.8;
            } else if (series.equals("Area")) {
                price = price * 0.9;
            }
            

            total += price;

        }

        if (budget >= total) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - total);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget - total));
        }
    }
}
