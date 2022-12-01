package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double breds = Math.ceil(1.00 * guests / 3);
        int eggs = guests * 2;

        double bredsPrice = breds * 4;
        double eggsPrice = eggs * 0.45;

        double totalPrice = bredsPrice + eggsPrice;


        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", breds, eggs);
            System.out.printf("He has %.2f lv. left.", Math.abs(budget - totalPrice));
        } else {

            System.out.print("Lyubo doesn't have enough money.\n");
            System.out.printf("He needs %.2f lv. more.", Math.abs(budget - totalPrice));

        }


    }
}
