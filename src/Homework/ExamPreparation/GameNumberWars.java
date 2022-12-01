package Homework.ExamPreparation;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String playerOneName = scan.nextLine();
        String playerTwoName = scan.nextLine();
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        int player1Points = 0;
        int player2Points = 0;

        while (!input1.equals("End of game") || !input2.equals("End of game")) {

            int currentPointPlayer1 = Integer.parseInt(input1);
            int currentPointPlayer2 = Integer.parseInt(input2);


            if (currentPointPlayer1 > currentPointPlayer2){
                player1Points = currentPointPlayer1 - currentPointPlayer2;
            }else if (currentPointPlayer2 > currentPointPlayer1){
                player2Points = currentPointPlayer2 - currentPointPlayer1;
            }else if (currentPointPlayer1 == currentPointPlayer2){


            }


            input2 = scan.nextLine();
            input1 = scan.nextLine();
        }


//След това, до получаване на команда "End of game", се четат многократно по два реда:
//1.	Карта, която дава първият играч- цяло число в интервала [2…9]
//2.	Карта, която дава вторият играч -  цяло число в интервала [2…9]
//При еднакви карти на двамата играчи се прочитат нови два реда
// (карта, която дава първият и карта, която дава вторият.)

    }
}
