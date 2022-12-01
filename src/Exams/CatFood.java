package Exams;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cats = Integer.parseInt(scan.nextLine());

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double totalFood = 0;
        double totalMoney = 0;

        for (int i = 1; i <= cats; i++) {

            double food = Double.parseDouble(scan.nextLine());

            if (food >= 100 && food < 200) {
                group1++; //от 100 (вкл.)  до 200 грама, то тя попада в група 1: малки котки.
            } else if (food >= 200 && food < 300) {
                group2++;  //от 200 (вкл.)  до 300 грама, то тя попада в група 2: големи котки.
            } else {
                group3++;  //от 300 (вкл.)  до 400 грама, то тя попада в група 3: огромни котки.
            }

            totalFood += food;

        }

        totalMoney = (totalFood / 1000) * 12.45;


        System.out.printf("Group 1: %d cats.\n", group1);
        System.out.printf("Group 2: %d cats.\n", group2);
        System.out.printf("Group 3: %d cats. \n", group3);
        System.out.printf("Price for food per day: %.2f lv.", totalMoney);


    }
}
