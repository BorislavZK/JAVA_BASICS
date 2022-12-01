package Homework.ExamPreparation;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scan.nextLine());
        double yuna = Double.parseDouble(scan.nextLine());
        double commission = Double.parseDouble(scan.nextLine());

        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 биткойн = 1168 лева.
        //•	1 евро = 1.95 лева.

        double bitToLev = bitcoin * 1168;
        double yunaToLev = (yuna * 0.15) * 1.76;

        double totalLev = bitToLev + yunaToLev;
        double totalEuro = totalLev / 1.95;

        double euroCommission = (totalEuro / 100) * commission;

        System.out.printf("%.2f", totalEuro - euroCommission);


    }
}
