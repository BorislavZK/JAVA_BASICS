package Homework.Exercises10;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int games = Integer.parseInt(scan.nextLine());
        int strartPoints = Integer.parseInt(scan.nextLine());
        int points = 0;
        int win = 0;

        for (int i = 1; i <= games; i++) {
            String type = scan.nextLine();

            switch (type) {
                case "W":
                case "w":
                    points += 2000;
                    win++;
                    break;
                case "F":
                case "f":
                    points += 1200;
                    break;
                case "SF":
                case "sf":
                    points += 720;
                    break;

            }

        }
        double percentWin = win * 1.00 / games * 100;

        System.out.printf("Final points: %d%n", points + strartPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points * 1.00 / games));
        System.out.printf("%.2f%%", percentWin);
    }
}
