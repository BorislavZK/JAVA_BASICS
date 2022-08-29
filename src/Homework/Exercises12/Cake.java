package Homework.Exercises12;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakeAllPieces = cakeWidth * cakeLength;
        int cakePiecesTaken = Integer.parseInt(scan.nextLine());


        while (cakeAllPieces > cakePiecesTaken){


            cakePiecesTaken = Integer.parseInt(scan.nextLine());




        }

    }
}
