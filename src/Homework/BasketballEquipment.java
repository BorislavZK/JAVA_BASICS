package Homework;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int AnnualFee = Integer.parseInt(scan.nextLine());
        //Цена на тренировките за година: 365
        //Цена на баскетболните кецове: 365 – 40% = 219
        //Цена на баскетболен екип: 219 – 20% = 175.20
        //Цена на баскетболна топка: 1 / 4 от 175.20 = 43.80
        //Цена на баскетболни аксесоари: 1 / 5 от 43.80 = 8.76
        //Обща цена за екипировката: 365 + 219 + 175.20 + 43.80 + 8.76 = 811.76

        double sneakers = AnnualFee - AnnualFee * 0.400;
        double ancung = sneakers - sneakers * 0.20;
        double ball = ancung * 0.25;
        double accessories = ball * 0.20;
        double TotalCost = AnnualFee + sneakers + ancung + ball + accessories;

        System.out.println(TotalCost);
    }
}
