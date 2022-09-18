package Homework.ExamPreparation;

import java.util.Scanner;

public class TouristShop_BOBI_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String product = scan.nextLine();

        int counter = 0;
        double totalSum = 0;

        while (!product.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            counter++;

            if (counter % 3 == 0) {
                price *= 0.5;
            }

            if ( budget < price) {
                double moneyNeeded = Math.abs( budget - price);
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", moneyNeeded);
                return;
            }

            totalSum += price;
            budget -= price;
            product = scan.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", counter, totalSum);


    }
}
