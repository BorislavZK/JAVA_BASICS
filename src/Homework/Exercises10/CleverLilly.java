package Homework.Exercises10;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washingMachine = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int brother = 0;
        int toys = 0;
        double moneyForBD = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyForBD += 10.00 * (i / 2.00);
                brother++;

            } else {
                toys++;
            }

        }

        double toysPrice = toys * toyPrice;
        double totalMoney = toysPrice + moneyForBD - brother;

        if (washingMachine <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);

        } else {

            System.out.printf("No! %.2f", washingMachine - totalMoney);
        }



        }


    }
