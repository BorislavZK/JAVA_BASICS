package Homework.ExamPreparation;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int hearthstone = 0;
        int fornite = 0;
        int ovewatch = 0;
        int others = 0;

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

        double hearthstonePer = (100.00 / n) * hearthstone;
        double fornitePer = (100.00 / n) * fornite;
        double ovewatchPer = (100.00 / n) * ovewatch;
        double othersPer = (100.00 / n) * others;

        System.out.printf("Hearthstone - %.2f%%\n", hearthstonePer);
        System.out.printf("Fornite - %.2f%%\n", fornitePer);
        System.out.printf("Overwatch - %.2f%%\n", ovewatchPer);
        System.out.printf("Others - %.2f%%", othersPer);


    }
}
