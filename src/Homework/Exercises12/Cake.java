package Homework.Exercises12;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakeAllPieces = cakeWidth * cakeLength; // vsichka parcheta
        boolean ifStop = false;

        int cakePiecesTake = Integer.parseInt(scan.nextLine());  //vzima 1 put

        while (cakeAllPieces > cakePiecesTake) {

            String input = scan.nextLine();

            if (input.equals("STOP")) {
                ifStop = true;
                break;
            }

            cakeAllPieces -= Integer.parseInt(input);

        }

        int cakeLeft = cakeAllPieces - cakePiecesTake;

        if (!ifStop) {

            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeLeft));

        } else {

            System.out.printf("%d pieces are left.", cakeLeft);
        }

    }
}
