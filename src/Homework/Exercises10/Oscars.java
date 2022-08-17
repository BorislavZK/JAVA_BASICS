package Homework.Exercises10;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            String name = scan.nextLine();
            double juryPoints = Double.parseDouble(scan.nextLine());
            int length = name.length();
            points += (length * juryPoints) / 2;
        }
    }
}
