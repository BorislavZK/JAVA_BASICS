package Homework.ExamPreparation;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minutes = Integer.parseInt(scan.nextLine());
        int walks = Integer.parseInt(scan.nextLine());
        int calories = Integer.parseInt(scan.nextLine());


        int totalMinutes = minutes * walks;
        int caloriesBurn = totalMinutes * 5;

        if (caloriesBurn >= (calories * 0.5)){

            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurn);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurn);
        }

    }
}
