package Homework;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double chickenPrice = 10.35;
        double porkPrice = 12.40;
        double vegiePrice = 8.15;
        double delivery = 2.50;


        int chickenMenu = Integer.parseInt(scan.next());
        int porkMenu = Integer.parseInt(scan.next());
        int veggieMenu = Integer.parseInt(scan.next());

        double totalPrice = chickenMenu * chickenPrice + porkMenu * porkPrice + veggieMenu * vegiePrice;
        double withDessert = totalPrice + totalPrice * 0.20;
        double totalCost = withDessert + delivery;

        System.out.println(totalCost);
    }
}
