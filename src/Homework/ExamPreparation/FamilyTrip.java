package Homework.ExamPreparation;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //От конзолата се четат 4 реда:
        //•	Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
        //•	Брой нощувки – цяло число в интервала [0 … 1000]
        //•	Цена за нощувка – реално число в интервала [1.00 … 500.00]
        //•	Процент за допълнителни разходи – цяло число в интервала [0 … 100]


        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        int additionalPercent = Integer.parseInt(scan.nextLine());


        if (nights > 7) {
            pricePerNight *= 0.95;
        }

        double additionalExpenses = (budget / 100) * additionalPercent;

        double totalPrice = pricePerNight * nights + additionalExpenses;

        if (budget >= totalPrice) {

            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {

            System.out.printf("%.2f leva needed.", Math.abs(budget - totalPrice));
        }





    }
}
