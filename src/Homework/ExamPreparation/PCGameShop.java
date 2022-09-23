package Homework.ExamPreparation;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int hearthstone = 0;
        int fornite = 0;
        int ovewatch = 0;
        int others = 8;

        for (int i = 1; i <= n; i++) {

            String game = scan.nextLine();

            if (game.equals("Hearthstone")) {
                hearthstone++;
            } else if (game.equals("Fornite")) {
                fornite++;
            } else if (game.equals("Overwatch")) {
                ovewatch++;
            } else {
                others++;
            }


        }


    }
}
