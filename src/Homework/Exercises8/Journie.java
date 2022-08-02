package Homework.Exercises8;

import java.util.Scanner;

public class Journie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String accomodation = "";
        double moneySpend = 0.0;


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpend = budget * 0.30;
                accomodation = "Camp";
            } else if (season.equals("winter")) {
                moneySpend = budget * 0.70;
                accomodation = "Hotel";

            }


        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpend = budget * 0.40;
                accomodation = "Camp";
            } else if (season.equals("winter")) {
                moneySpend = budget * 0.80;
                accomodation = "Hotel";
            }


        } else {
            destination = "Europe";
            moneySpend = budget * 0.90;
            accomodation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, moneySpend);
    }
}
