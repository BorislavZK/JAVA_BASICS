package Exams;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double avgSpeed = Double.parseDouble(scan.nextLine());
        double fuelFor100km = Double.parseDouble(scan.nextLine());

        double distance = 384400 * 2;
        double time = Math.round(distance / avgSpeed); // ATT
        double totalTime = time + 3;
        double totalFuel = ( distance * fuelFor100km) / 100;


        System.out.printf("%.0f\n", totalTime);
        System.out.printf("%.0f", totalFuel);
    }
}
