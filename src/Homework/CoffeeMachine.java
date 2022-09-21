package Homework;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int cups = Integer.parseInt(scan.nextLine());
        double price = 0;
        double totalPrice = 0;




        switch (drink) {
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

        if (sugar.equals("Without")){
            price *= 0.65;
        }else if (drink.equals("Espresso") && cups >= 5){
            price *= 0.75;
        }

        totalPrice = price * cups;

        if (totalPrice > 15){
            totalPrice *= 0.80;
        }


    }
}
