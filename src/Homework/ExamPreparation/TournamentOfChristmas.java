package Homework.ExamPreparation;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double totalMoney = 0;
        int winTotal = 0;

        for (int i = 1; i <= days; i++) {

            int winPerDayCounter = 0;
            int loosePerDayCounter = 0;
            double money = 0;
            int dailyWin = 0;

            String sport = scan.nextLine();

            while (!sport.equals("Finish")) {
                String result = scan.nextLine();

                if (result.equals("win")) {
                    money += 20;
                    winPerDayCounter++;

                } else {

                    loosePerDayCounter++;
                }

                sport = scan.nextLine();
            }

            if (winPerDayCounter > loosePerDayCounter) {
                money *= 1.1;
                dailyWin += 1;

            }
            winTotal += dailyWin;
            totalMoney += money;

        }

        if (winTotal == days) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);

        } else {

            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }


    }
}
