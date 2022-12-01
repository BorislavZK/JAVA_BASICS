package Homework.ExamPreparation;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String set = scan.nextLine();
        int setsCount = Integer.parseInt(scan.nextLine());

        double price = 0;
        int count = 0;
        double totalPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (set.equals("small")){
                    price = 56;
                    count = 2;
                } else {
                    price = 28.70;
                    count = 5;
                }

                break;
            case "Mango":
                if (set.equals("small")){
                    price = 36.66;
                    count = 2;
                } else {
                    price = 19.60;
                    count = 5;
                }
                break;
            case "Pineapple":
                if (set.equals("small")){
                    price = 42.10;
                    count = 2;
                } else {
                    price = 24.80;
                    count = 5;
                }
                break;
            case "Raspberry":
                if (set.equals("small")){
                    price = 20;
                    count = 2;
                } else {
                    price = 15.20;
                    count = 5;
                }
                break;
        }


        totalPrice = count * price * setsCount;

        if ( totalPrice >= 400 && totalPrice <= 1000 ){
            totalPrice = totalPrice * 0.85;
        } else if ( totalPrice > 1000 ){
            totalPrice = totalPrice * 0.5;
        }


        System.out.printf("%.2f lv.", totalPrice);


    }
}
