package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int breads = Integer.parseInt(scan.nextLine());
        double totalSugar = 0;
        double totalFlour = 0;
        int sugarMax = Integer.MIN_VALUE;
        int flourMax = Integer.MIN_VALUE;


        for (int i = 1; i <= breads; i++) {

            int sugar = Integer.parseInt(scan.nextLine());
            int flour = Integer.parseInt(scan.nextLine());

            totalSugar += sugar;
            totalFlour += flour;

            if (sugarMax < sugar){
                sugarMax = sugar;
            }

            if (flourMax < flour){
                flourMax = flour;
            }

        }

        System.out.printf("Sugar: %.0f\n",Math.ceil(totalSugar / 950));
        System.out.printf("Flour: %.0f\n",Math.ceil(totalFlour / 750));


        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",flourMax,sugarMax);


    }
}
