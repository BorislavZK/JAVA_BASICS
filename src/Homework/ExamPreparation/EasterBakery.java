package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugar = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int east = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        double flourTotal = flourKg * flourPrice;
        double sugarPrice = flourPrice * 0.75;
        double sugarTotal = sugar * sugarPrice;
        double eggsTotal = eggs * (flourPrice * 1.1);
        double eastTotal = east * (sugarPrice * 0.2);

        totalPrice = flourTotal + sugarTotal + eggsTotal + eastTotal;


        System.out.printf("%.2f", totalPrice);


    }
}
