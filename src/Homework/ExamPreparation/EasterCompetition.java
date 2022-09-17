package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cacke = Integer.parseInt(scan.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= cacke ; i++) {
            String baker = scan.nextLine();
            int totalPoints = 0;
            String input = scan.nextLine();

            while (!input.equals("Stop")) {
                int evaluation = Integer.parseInt(input);
                totalPoints += evaluation;

                input = scan.nextLine();
            }

            System.out.printf("%s has %d points.\n", baker, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                System.out.printf("%s is the new number 1!\n", baker);
                winner = baker;

            }

        }

        System.out.printf("%s won competition with %d points!", winner, maxPoints);

    }
}
