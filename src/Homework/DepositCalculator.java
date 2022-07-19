package Homework;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double Amount = Double.parseDouble(scan.nextLine());
        int mounts = Integer.parseInt(scan.nextLine());
        double glp = Double.parseDouble(scan.nextLine());

        double lih = Amount * (glp / 100);
        double lpm = lih / 12;
        double TotalAmount = Amount + lpm * mounts;

        System.out.println(TotalAmount);

    }
}
