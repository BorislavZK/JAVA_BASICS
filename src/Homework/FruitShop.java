package Homework;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Thursday":
            case "Wednesday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = 2.50;
                } else if (fruit.equals("apple")) {
                    price = 1.20;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                }
                break;

            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.70;
                } else if (fruit.equals("apple")) {
                    price = 1.25;
                } else if (fruit.equals("orange")) {
                    price = 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = 3.00;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60;
                } else if (fruit.equals("grapes")) {
                    price = 4.20;
                }
                break;
        }
        if (price == 0.0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", amount * price);
        }

    }
}
