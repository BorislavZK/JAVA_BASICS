package Homework;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        int all = rows * columns;
        double income = 0.0;

        switch (type){
            case "Premiere":
                income = all * 12.00;
                break;
            case "Normal":
                income = all * 7.50;
                break;
            case "Discount":
                income = all * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);

    }
}
