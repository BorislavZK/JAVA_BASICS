package Homework.ExamPreparation;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int playerOneEggs = Integer.parseInt(scan.nextLine());
        int playerTwoEggs = Integer.parseInt(scan.nextLine());

        boolean playerOneFlag = false;
        boolean playerTwoFlag = false;

        String input = scan.nextLine();

        while (!input.equals("End")){

            if (input.equals("one")){

                playerTwoEggs --;

                if (playerTwoEggs < 1){
                    playerTwoFlag = true;
                    System.out.print("Player two is out of eggs. ");
                    break;
                }

            } else if (input.equals("two")){

                playerOneEggs --;

                if(playerOneEggs < 1){
                    playerOneFlag = true;
                    System.out.print("Player one is out of eggs. ");
                    break;
                }
            }

            input = scan.nextLine();
        }

        if(playerTwoFlag){
            System.out.printf("Player one has %d eggs left.", playerOneEggs);
        } else if (playerOneFlag){
            System.out.printf("Player two has %d eggs left.", playerTwoEggs);
        } else {
            System.out.printf("Player one has %d eggs left.\n", playerOneEggs);
            System.out.printf("Player two has %d eggs left.", playerTwoEggs);

        }


    }
}
