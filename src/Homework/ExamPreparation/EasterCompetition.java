package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cacke = Integer.parseInt(scan.nextLine());
        int maxPoints = Integer.MIN_VALUE;
        String baker = "";

        String input = "";

        for (int i = 1; i <= cacke ; i++) {
            baker = scan.nextLine();
            input = scan.nextLine();
            int totalPoints = 0;


            while (!input.equals("Stop")){
             int evaluation = Integer.parseInt(input);
             totalPoints += evaluation;

                input = scan.nextLine();
            }

            System.out.printf("%s has %d points.", baker, totalPoints);






        }



    }
}
