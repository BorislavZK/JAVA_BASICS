package Homework;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double outfit = Double.parseDouble(scan.nextLine());
        double movieSet = movieBudget * 0.10;


        if ( statists >= 150 ){
            outfit = outfit - ( outfit * 0.10 );
        }

        double expences = movieSet + outfit * statists;
        double moneyNeeded = expences - movieBudget;
        double moneyExtra = movieBudget - expences;

        if ( expences > movieBudget ){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }else if (expences <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyExtra);

        }

    }
}
