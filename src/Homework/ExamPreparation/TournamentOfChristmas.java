package Homework.ExamPreparation;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();
        double money = 0;
        int winCounter = 0;
        int looseCounter = 0;


        for (int i = 1; i <= days ; i++) {


            while (!sport.equals("Finish")) {
                String result = scan.nextLine();

                if (result.equals("win")) {
                    money += 20;
                    winCounter++;
                } else {
                    looseCounter++;
                }


                sport = scan.nextLine();
            }

        }



    }
}
