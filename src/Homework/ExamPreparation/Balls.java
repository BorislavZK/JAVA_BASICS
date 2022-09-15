package Homework.ExamPreparation;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int others = 0;
        int totalPoints = 0;

        for (int i = 1; i <= n; i++) {

            String ball = scan.nextLine();

            switch (ball) {
                case "red":
                    totalPoints += 5;
                    red++;
                    break;

                case "orange":
                    totalPoints += 10;
                    orange++;
                    break;

                case "yellow":
                    totalPoints += 15;
                    yellow++;
                    break;

                case "white":
                    totalPoints += 20;
                    white++;
                    break;

                case "black":
                    totalPoints /= 2;
                    black++;
                    break;

                default:
                    others++;
                    break;
            }


        }

        System.out.printf("Total points: %d\n", totalPoints);
        System.out.println("Red balls: " + red);
        System.out.println("Orange balls: " + orange);
        System.out.println("Yellow balls: " + yellow);
        System.out.println("White balls: " + white);
        System.out.println("Other colors picked: " + others);
        System.out.println("Divides from black balls: " + black);



//        Red balls: 2
//        Orange balls: 0
//        Yellow balls: 0
//        White balls: 0
//        Other colors picked: 3
//        Divides from black balls: 0

    }
}
