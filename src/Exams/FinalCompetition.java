package Exams;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();

        double prize = 0;
        double expensesPer = 0;
        double donationPer = 0.75;
        double donation = 0;
        double total = 0;

        switch (place) {
            case "Bulgaria":
                prize = points * dancers;
                if (season.equals("summer")) {
                    expensesPer = 0.95;
                } else {
                    expensesPer = 0.92;
                }
                break;
            case "Abroad":
                prize = points * dancers;
                prize = prize * 1.5;
                if (season.equals("summer")) {
                    expensesPer = 0.9;
                } else {
                    expensesPer = 0.85;
                }
                break;

        }

        donation = (prize * expensesPer) * donationPer; // za print
        total = (prize * expensesPer) - donation;
        double moneyPerPerson = total / dancers; // za print

        System.out.printf("Charity - %.2f\n",donation);
        System.out.printf("Money per dancer - %.2f",moneyPerPerson);
    }
}
