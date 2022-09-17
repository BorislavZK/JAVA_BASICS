package Homework.ExamPreparation;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String product = scan.nextLine();
        double totalSum = 0;
        int counter = 0;
        boolean flag = true;
        double moneyNeeded = 0;

        while (!product.equals("Stop")) {

            double price = Double.parseDouble(scan.nextLine());

            if (budget >= price) {
                counter++;

                if (counter % 3 == 0 ){
                    price *= 0.5;
                }
                budget -= price;
                totalSum += price;
            }

            if (budget < price) {
                System.out.println("You don't have enough money!");
                moneyNeeded = price - budget;
                flag = false;
                break;
            }

            product = scan.nextLine();
        }

        if (flag) {
            System.out.printf("You bought %d products for %.2f leva.\n",counter,totalSum);
        } else {
            System.out.printf("You need %.2f leva!", moneyNeeded);
        }

    }
}
