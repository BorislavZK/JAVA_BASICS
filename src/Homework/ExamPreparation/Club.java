package Homework.ExamPreparation;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double profitNeeded = Double.parseDouble(scan.nextLine());
        String drink = scan.nextLine();
        double totalProfit = 0;


        while (!drink.equals("Party!")){

            int drinksCount = Integer.parseInt(scan.nextLine()); // Брой напитки
            double drinkPrice = drink.length(); // Цена на единична напитка
            double orderPrice = drinksCount * drinkPrice; // Цена на поръчката


            if (orderPrice % 2 != 0) {       // OTSTUPKA
                orderPrice = orderPrice - (orderPrice * 0.25);
            }

            totalProfit += orderPrice;

            if (totalProfit >= profitNeeded) {
                System.out.print("Target acquired.\n");
                break;

            }

            drink = scan.nextLine();

            if (drink.equals("Party!")){

                System.out.printf("We need %.2f leva more.\n", Math.abs(profitNeeded - totalProfit));

                break;
            }

        }

        System.out.printf("Club income - %.2f leva.", totalProfit);

    }
}
