package Homework;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int gpu = Integer.parseInt(scan.nextLine());
        int cpu = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());

        double gpuprice = gpu * 250;
        double cpuprice = cpu * (gpuprice * 0.35);
        double ramprice = ram * (gpuprice * 0.10);
        double totalSum = gpuprice + cpuprice + ramprice;

        if (gpu > cpu){
            totalSum = totalSum - totalSum * 0.15;
        }
        if (budget >= totalSum){
            System.out.printf("You have %.2f leva left!", Math.abs(totalSum - budget));
        }else if ( budget < totalSum){
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(totalSum - budget));
        }

    }
}
