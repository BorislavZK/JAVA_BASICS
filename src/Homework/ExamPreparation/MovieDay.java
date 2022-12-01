package Homework.ExamPreparation;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scan.nextLine());
        int scenes = Integer.parseInt(scan.nextLine());
        int duration = Integer.parseInt(scan.nextLine());

        double preparation = shootingTime * 0.15;
        double scenesTime = scenes * duration;
        double totalTime = preparation + scenesTime;

        if (shootingTime >= totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(Math.abs(shootingTime - totalTime)));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(Math.abs(totalTime - shootingTime)));

        }

    }
}
