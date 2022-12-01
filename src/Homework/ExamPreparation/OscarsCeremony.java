package Homework.ExamPreparation;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hallRent = Integer.parseInt(scan.nextLine());

        double statuettePrice = hallRent * 0.7;
        double catering = statuettePrice * 0.85;
        double sound = catering * 0.5;

        double totalExpenses = hallRent + statuettePrice + catering+ sound;

        System.out.printf("%.2f", totalExpenses);
    }
}
