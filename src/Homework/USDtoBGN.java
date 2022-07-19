package Homework;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1 USD = 1.79549 BGN.

        double usd = Double.parseDouble(scan.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
