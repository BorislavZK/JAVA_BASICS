package Homework.ExamPreparation;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {

        //•	Име на турнира – текст ok
        //•	За всеки турнир n на брой мача – цяло число в интервала [1…15]
        //•	За всеки мач се четат по два реда:
        //o	Точки, вкарани от отбора на Деси – цяло число в интервала от [0…150]
        //o	Точки, вкарани от противниковия отбор – цяло число в интервала от [0…150]

        Scanner scan = new Scanner(System.in);

        String tournament = scan.nextLine();

        int win = 0;
        int loose = 0;
        int totalTournaments = 0;
        int matchCount = 0;

        while (!tournament.equals("End of tournaments")) {

            totalTournaments ++;

            int match = Integer.parseInt(scan.nextLine());

            for (int i = 1; i <= match; i++) {

                matchCount++;

                int dessyTeamPoints = Integer.parseInt(scan.nextLine());
                int opponentsPoints = Integer.parseInt(scan.nextLine());

                if (dessyTeamPoints > opponentsPoints) {
                    win++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, tournament, dessyTeamPoints - opponentsPoints);
                } else {
                    loose++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, tournament, Math.abs(dessyTeamPoints - opponentsPoints));
                }

            }

            tournament = scan.nextLine();


        }

        System.out.printf("%.2f%% matches win\n", (1.0 * win / matchCount) * 100 );
        System.out.printf("%.2f%% matches lost", (1.0 * loose / matchCount) * 100 );


    }
}
