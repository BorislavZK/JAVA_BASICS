package Homework.ExamPreparation;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double priceStrawberries = Double.parseDouble(scan.nextLine());
        double quantityBananas = Double.parseDouble(scan.nextLine());
        double quantityOranges = Double.parseDouble(scan.nextLine());
        double quantityRaspberries = Double.parseDouble(scan.nextLine());
        double quantityStrawberries = Double.parseDouble(scan.nextLine());

        double priceRaspberries = priceStrawberries - (0.5 * priceStrawberries);
        double priceOranges = priceRaspberries - (0.4 * priceRaspberries);
        double priceBananas = priceRaspberries - (0.8 * priceRaspberries);

        double sumStrawberries = priceStrawberries * quantityStrawberries;
        double sumBananas = priceBananas * quantityBananas;
        double sumOranges = priceOranges * quantityOranges;
        double sumRaspberries = priceRaspberries * quantityRaspberries;

        double totalSum = sumStrawberries + sumBananas + sumOranges + sumRaspberries;

        System.out.printf("%.2f", totalSum);

    }
}
