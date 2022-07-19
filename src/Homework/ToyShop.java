package Homework;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int doll = Integer.parseInt(scan.nextLine());
        int bear = Integer.parseInt(scan.nextLine());
        int minion = Integer.parseInt(scan.nextLine());
        int truck = Integer.parseInt(scan.nextLine());

        double totalSum = puzzle * 2.60 + doll * 3.00 + bear * 4.10 + minion * 8.20 + truck * 2.00;
        int count = puzzle + doll + bear + minion + truck;

        if (count >= 50){
            totalSum = totalSum - ( totalSum * 0.25 );
        }
        totalSum = totalSum - ( totalSum * 0.10 );

        if ( totalSum >= tourPrice ){
            System.out.printf("Yes! %.2f lv left.", totalSum - tourPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum - tourPrice));

        }

    }
}
