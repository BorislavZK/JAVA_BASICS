package Homework.ExamPreparation;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        char sex = scan.nextLine().charAt(0);
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

       
        char m = 'm';
        double price = 0;


        switch (sport) {
            case "Gym":
                if (sex == m) {
                    price = 42;
                } else {
                    price = 35;
                }
                break;

            case "Boxing":

                if (sex == m) {
                    price = 41;
                } else {
                    price = 37;
                }
                break;

            case "Yoga":
                if (sex == m) {
                    price = 45;
                } else {
                    price = 42;
                }
                break;

            case "Zumba":
                if (sex == m) {
                    price = 34;
                } else {
                    price = 31;
                }
                break;

            case "Dances":
                if (sex == m) {
                    price = 51;
                } else {
                    price = 53;
                }
                break;

            case "Pilates":
                if (sex == m) {
                    price = 39;
                } else {
                    price = 37;
                }
                break;
        }


        if (age <= 19) {
            price = price * 0.8;
        }


        if (price <= money) {

            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
        }

    }


}
