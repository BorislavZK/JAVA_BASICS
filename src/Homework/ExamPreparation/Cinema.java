package Homework.ExamPreparation;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int ticketPrice = 5;
        int discount = 5;
        int totalIncome = 0;
        boolean flag = false;


        while (!input.equals("Movie time!")) {

            int currentVisitors = Integer.parseInt(input);
            int currentPrice = 0;

            if (currentVisitors <= capacity) {
                capacity -= currentVisitors;
                currentPrice = currentVisitors * ticketPrice;
                if (currentVisitors % 3 == 0) {
                    currentPrice -= discount;
                }
            } else {
                flag = true;
                break;
            }

            totalIncome += currentPrice;
            input = scan.nextLine();
        }


        if(flag){
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.",totalIncome);

        } else {
            System.out.printf("There are %d seats left in the cinema.\n", capacity);
            System.out.printf("Cinema income - %d lv.",totalIncome);
        }



    }
}
