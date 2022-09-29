package Homework.ExamPreparation;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double allFood = Double.parseDouble(scan.nextLine());
        double biscuits = 0;
        double dogFood = 0;
        double catFood = 0;

        for (int i = 1; i <= days ; i++) {

            int dogEaten = Integer.parseInt(scan.nextLine());
            int catEaten = Integer.parseInt(scan.nextLine());
            dogFood += dogEaten;
            catFood += catEaten;

            if ( i % 3 == 0){
                biscuits += (dogEaten+catEaten) * 0.1;
            }

        }

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (((dogFood + catFood) / allFood) * 100));
        System.out.printf("%.2f%% eaten from the dog.%n", (dogFood / (dogFood + catFood) * 100));
        System.out.printf("%.2f%% eaten from the cat.%n", (catFood / (dogFood + catFood) * 100));


    }
}
