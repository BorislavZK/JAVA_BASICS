package Homework;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogTotal = dogFood * 2.50;
        double catTotal = catFood * 4.00;
        double totalPrice = dogTotal + catTotal;

        System.out.printf("%.1f lv.", totalPrice);

    }
}
