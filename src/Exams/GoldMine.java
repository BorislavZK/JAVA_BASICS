package Exams;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int locations = Integer.parseInt(scan.nextLine());

        double avgPerDay = 0;

        for (int i = 1; i <= locations; i++) {
            double totalGoldPerLocation = 0;

            double avgExpect = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());

            for (int j = 1; j <= days; j++) {

                double goldMinedPerDay = Double.parseDouble(scan.nextLine());

                totalGoldPerLocation += goldMinedPerDay;

            }

            avgPerDay = totalGoldPerLocation / days;

            if (avgExpect <= avgPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", avgPerDay);
            } else {
                System.out.printf("You need %.2f gold.\n",Math.abs(avgExpect-avgPerDay));
            }


        }


    }
}
