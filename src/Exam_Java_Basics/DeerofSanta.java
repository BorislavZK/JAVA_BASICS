package Exam_Java_Basics;

import java.util.Scanner;

public class DeerofSanta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int daysMissing = Integer.parseInt(scan.nextLine());
        int foodKilos = Integer.parseInt(scan.nextLine());
        double firstKg = Double.parseDouble(scan.nextLine());
        double secondKg = Double.parseDouble(scan.nextLine());
        double thirdKg = Double.parseDouble(scan.nextLine());

        double firstDeerFood = daysMissing * firstKg;
        double secondDeerFood = daysMissing * secondKg;
        double thirdDeerFood = daysMissing * thirdKg;

        double totalFoodNeeded = firstDeerFood + secondDeerFood + thirdDeerFood;


        if (foodKilos >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKilos - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalFoodNeeded - foodKilos));
        }


    }
}
