package Homework.ExamPreparation;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double pricePerHour = 0;
        double pricePerDay = 0;
        double priceTotal = 0;

        //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
        //Във всеки нечетен ден и четен час таксата е 1.25 лева,
        //във всички останали случаи се заплаща 1 лев.
        //Таксуването става на всеки изминал час от деня.
        // Всеки един от изходите трябва да бъде закръглен до втория знак след десетичната запетая.

        for (int d = 1; d <= days; d++) {
            pricePerDay = 0;
            for (int h = 1; h <= hours; h++) {
                pricePerHour = 0;

                if (d % 2 == 0 && h % 2 != 0) {
                    pricePerHour = 2.5;

                } else if (d % 2 != 0 && h % 2 == 0) {
                    pricePerHour = 1.25;

                } else {
                    pricePerHour = 1;
                }


                pricePerDay += pricePerHour;


            }

            priceTotal += pricePerDay;
            System.out.printf("Day: %d - %.2f leva\n", d, pricePerDay);


        }

        System.out.printf("Total: %.2f leva", priceTotal);


    }
}
