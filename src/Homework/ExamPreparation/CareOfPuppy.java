package Homework.ExamPreparation;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scan.nextLine());
        int foodInGr = foodInKg * 1000;
        int allEatenFood = 0;
        String input = scan.nextLine();

        while (!input.equals("Adopted")) {
            int currentFood = Integer.parseInt(input);
            allEatenFood += currentFood;

            input = scan.nextLine();
        }

        int diff = Math.abs(allEatenFood - foodInGr);

        if (allEatenFood <= foodInGr) {

            System.out.printf("Food is enough! Leftovers: %d grams.", diff);

        } else {

            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }

    }
}
