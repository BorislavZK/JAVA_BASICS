package Niki;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String beverage = scan.nextLine();
        String sugar = scan.nextLine();
        int countBeverages = Integer.parseInt(scan.nextLine());
        double price = 0;
        double sum = 0;


        switch (beverage) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = 0.90;
                } else if (sugar.equals("Normal")) {
                    price = 1.00;
                } else {
                    price = 1.20;
                }
                break;

            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = 1.00;
                } else if (sugar.equals("Normal")) {
                    price = 1.20;
                } else {
                    price = 1.60;
                }

                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = 0.50;
                } else if (sugar.equals("Normal")) {
                    price = 0.60;
                } else {
                    price = 0.70;
                }

                break;
        }
        if (sugar.equals("Without")) {
            price *= 0.65;
        }

        if (beverage.equals("Espresso") && countBeverages >= 5) {
            price *= 0.75;
        }

        sum = price * countBeverages;

        if (sum > 15) {
            sum *= 0.80;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", countBeverages, beverage, sum);
    }
}