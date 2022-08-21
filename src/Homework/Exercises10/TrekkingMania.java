package Homework.Exercises10;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int musala = 0; //до 5 човека
        int montblanc = 0; // от 6 до 12 човека
        int kilimanjaro = 0; // от 13 до 25 човека
        int k2 = 0; // от 26 до 40 човека
        int everest = 0; // от 41 или повече човека

        for (int i = 1; i <= n; i++) {
            int hikers = Integer.parseInt(scan.nextLine());

            if (hikers >= 1 && hikers <= 5) {
                musala += hikers;
            } else if (hikers >= 6 && hikers <= 12) {
                montblanc += hikers;
            } else if (hikers >= 13 && hikers <= 25) {
                kilimanjaro += hikers;
            } else if (hikers >= 26 && hikers <= 40) {
                k2 += hikers;
            } else {
                everest += hikers;
            }

        }
        int allHikers = musala + montblanc + kilimanjaro + k2 + everest;
        double musPer = (musala * 1.00) / allHikers * 100.00;
        double monPer = (montblanc * 1.00) / allHikers * 100;
        double kiliPer = (kilimanjaro * 1.00) / allHikers * 100;
        double k2Per = (k2 * 1.00) / allHikers * 100;
        double everestPer = (everest * 1.00) / allHikers * 100;


        System.out.printf("%.2f%%%n", musPer);
        System.out.printf("%.2f%%%n", monPer);
        System.out.printf("%.2f%%%n", kiliPer);
        System.out.printf("%.2f%%%n", k2Per);
        System.out.printf("%.2f%%%n", everestPer);

    }
}
