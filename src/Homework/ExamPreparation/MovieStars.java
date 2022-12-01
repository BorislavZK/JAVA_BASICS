package Homework.ExamPreparation;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double totalFees = 0;
        boolean flag = false;

        while (!input.equals("ACTION")){

            double actorsFee = 0;

            if(input.length() > 15){
                actorsFee = budget * 0.2;
            } else {
                actorsFee = Double.parseDouble(scan.nextLine());
            }

            budget -= actorsFee;
            totalFees += actorsFee;

            if (budget < 0){
                flag = true;
                break;
            }

            input = scan.nextLine();
        }

        if (flag){
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", Math.abs(budget));
        }

    }
}
