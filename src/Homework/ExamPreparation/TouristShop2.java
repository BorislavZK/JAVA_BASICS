package Homework.ExamPreparation;

import java.util.Scanner;

public class TouristShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        int productsCount = 0;
        double priceAll = 0.0;

        while (!"Stop".equalsIgnoreCase(productName)) {
            double price = Double.parseDouble(scanner.nextLine());
            productsCount++;

            if (productsCount % 3 == 0) {
                price *= 0.5;
            }
            if (budget < price) {
                double shortMoney = Math.abs(price - budget);
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", shortMoney);
                return;
            }
            priceAll += price;
            budget -= price;
            productName = scanner.nextLine();

        }
        System.out.printf("You bought %d products for %.2f leva.", productsCount, priceAll);
    }
}


