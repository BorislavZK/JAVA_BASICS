package Homework.ExamPreparation;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int backCounter = 0;
        int chestCounter = 0;
        int legsCounter = 0;
        int absCounter = 0;
        int proteinShakeCounter = 0;
        int proteinBarCounter = 0;
        int proteinCounter = 0;
        int workoutCounter = 0;

        for (int i = 1; i <= visitors; i++) {

            String activity = scanner.nextLine();

            if (activity.equals("Back")) {
                backCounter++;
                workoutCounter++;
            } else if (activity.equals("Chest")) {
                chestCounter++;
                workoutCounter++;
            } else if (activity.equals("Legs")) {
                legsCounter++;
                workoutCounter++;
            } else if (activity.equals("Abs")) {
                absCounter++;
                workoutCounter++;
            } else if (activity.equals("Protein shake")) {
                proteinCounter++;
                proteinShakeCounter++;
            } else {
                proteinCounter++;
                proteinBarCounter++;
            }

        }

        //double workoutPer = (visitors / 100.00) * workoutCounter;
        double workoutPer = (1.00 * workoutCounter / visitors) * 100;
        //double proteinPer = (visitors / 100.00) * proteinCounter;
        double proteinPer = (1.00 * proteinCounter / visitors) * 100;

        System.out.printf("%d - back\n", backCounter);
        System.out.printf("%d - chest\n", chestCounter);
        System.out.printf("%d - legs\n", legsCounter);
        System.out.printf("%d - abs\n", absCounter);
        System.out.printf("%d - protein shake\n", proteinShakeCounter);
        System.out.printf("%d - protein bar\n", proteinBarCounter);
        System.out.printf("%.2f%% - work out\n", workoutPer);
        System.out.printf("%.2f%% - protein", proteinPer);


    }
}
