package Homework.Exercises10;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scan.nextLine();
            double juryPoints = Double.parseDouble(scan.nextLine());
            int length = name.length();

            points += (length * juryPoints) / 2;
            if (points > 1250.5) {
                System.out.println();
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - points);
    }
}

