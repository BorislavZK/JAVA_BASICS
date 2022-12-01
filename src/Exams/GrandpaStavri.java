package Exams;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //•	За всеки един ден на отделен ред:
        //	количество на ракията – реално число в интервала [1.00...500.00]
        //	градус на получената напитка - реално число в интервала [10.00...99.00]


        double totalQuantity = 0;
        double totalDegree = 0;

        double degreeSum = 0;

        int days = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= days; i++) {

            double quantity = Double.parseDouble(scan.nextLine());
            double degree = Double.parseDouble(scan.nextLine());

            totalQuantity += quantity;
            degreeSum = quantity * degree;

            totalDegree += degreeSum;

        }

        double degreeAvg = totalDegree / totalQuantity;

        System.out.printf("Liter: %.2f\n", totalQuantity);
        System.out.printf("Degrees: %.2f\n", degreeAvg);

        if (degreeAvg < 38) {
            System.out.print("Not good, you should baking!");
        } else if (degreeAvg <= 42) {
            System.out.print("Super!");
        } else {
            System.out.print("Dilution with distilled water!");
        }

    }
}
