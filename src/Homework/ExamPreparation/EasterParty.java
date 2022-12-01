package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine()); // cena za 1 kuvert
        double budget = Double.parseDouble(scanner.nextLine());

        double cakePrice = budget * 0.1;

        if (guests >= 10 && guests <= 15) {
            price = price * 0.85;
        } else if (guests > 15 && guests <= 20) {
            price = price * 0.8;
        } else if (guests > 20) {
            price = price * 0.75;
        }

        double totalGuestsPrice = guests * price;
        double total = totalGuestsPrice + cakePrice;


        if (budget >= total) {
            System.out.printf("It is party time! %.2f leva left.", Math.abs(budget - total));
        } else {
            System.out.printf("No party! %.2f leva needed.", Math.abs(budget - total));
        }

    }
}
