package Homework.ExamPreparation;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double entranceFee = Double.parseDouble(scan.nextLine());
        double chairPrice = Double.parseDouble(scan.nextLine());
        double umbrellaPrice = Double.parseDouble(scan.nextLine());


        double totalEntranceFees = people * entranceFee;
        double totalUmbrellaNeeds = Math.ceil((people * 1.00) / 2);
        double totalChairsPRice = (people * 0.75) * chairPrice;




    }
}
