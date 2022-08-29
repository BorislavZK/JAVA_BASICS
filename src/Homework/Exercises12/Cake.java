package Homework.Exercises12;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scan.nextLine());
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakePiecesTaken = Integer.parseInt(scan.nextLine());

        int cakeAllPieces = cakeWidth * cakeLength;


        while (cakeAllPieces > cakePiecesTaken){

            String input = scan.nextLine();

            if (input.equals("STOP")){
                break;
            }



            cakePiecesTaken += Integer.parseInt(input);




        }

    }
}
