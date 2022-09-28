package Homework.ExamPreparation;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double totalMoney = 0;
        int winTotal = 0;
        int loseTotal = 0;

        for (int i = 1; i <= days; i++) {

            int winDailyCounter = 0;
            int loseDailyCounter = 0;
            double money = 0;
            int dailyWin = 0;

            String sport = scan.nextLine();

            while (!sport.equals("Finish")) {

                String result = scan.nextLine();

                if (result.equals("win")) {
                    money += 20;
                    winDailyCounter++;
                    winTotal++;

                } else {
                    loseDailyCounter++;
                    loseTotal++;
                }

                sport = scan.nextLine();
            }

            if (winDailyCounter > loseDailyCounter) {
                money *= 1.1;

            }
                totalMoney += money;

        }
        if (winTotal > loseTotal) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);

        } else {

            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
