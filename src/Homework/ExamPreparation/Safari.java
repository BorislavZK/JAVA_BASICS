package Homework.ExamPreparation;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double fuel = Double.parseDouble(scan.nextLine());
        String weekDay = scan.nextLine();

        double fuelPrice = 2.10;
        double guidePrice = 100;

        if (weekDay.equals("Saturday")) {
            fuelPrice = fuelPrice * 0.9;
            guidePrice = guidePrice * 0.9;

        } else if (weekDay.equals("Sunday")) {
            fuelPrice = fuelPrice * 0.8;
            guidePrice = guidePrice * 0.8;
        }

        double fuelTotal = fuel * fuelPrice;

        double totalSum = fuelTotal + guidePrice;

        if (budget >= totalSum) {
            System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(budget - totalSum));
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget - totalSum));
        }

    }
}
