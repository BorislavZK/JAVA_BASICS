package Exams;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = 5;

        double teresaPocketMoney = Double.parseDouble(scan.nextLine());
        double teresaIncome = Double.parseDouble(scan.nextLine());
        double teresaExpenses = Double.parseDouble(scan.nextLine());
        double presentPrice = Double.parseDouble(scan.nextLine());


        double totalMoneySaved = days * teresaPocketMoney + days * teresaIncome - teresaExpenses;


        if (totalMoneySaved >= presentPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoneySaved);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", presentPrice - totalMoneySaved);
        }



    }
}
