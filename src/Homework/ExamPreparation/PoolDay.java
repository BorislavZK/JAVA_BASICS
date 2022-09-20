package Homework.ExamPreparation;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double entranceFee = Double.parseDouble(scan.nextLine());
        double chairPrice = Double.parseDouble(scan.nextLine());
        double umbrellaPrice = Double.parseDouble(scan.nextLine());

        double totalEntranceFees = people * entranceFee;  // OK
        double totalUmbrellaNeeds = Math.ceil(people * 0.5);
        double totalChairsPrice = Math.ceil((people * 0.75)) * chairPrice;

        double totalAll = totalEntranceFees + totalUmbrellaNeeds * umbrellaPrice + totalChairsPrice;

        System.out.printf("%.2f lv.", totalAll);




    }
}
