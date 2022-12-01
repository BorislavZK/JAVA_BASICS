package Homework.ExamPreparation;

import java.util.Scanner;

public class NumberWarsTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String playerOneName = scanner.nextLine();
        String playerTwoName = scanner.nextLine();

        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        String command;

        while (true) {
            command = scanner.nextLine();
            if (command.equals("End of game")) {
                System.out.printf("%s has %d points\n", playerOneName, playerOnePoints);
                System.out.printf("%s has %d points", playerTwoName, playerTwoPoints);

                break;
            }
            int cardPlayerOne = Integer.parseInt(command);
            command = scanner.nextLine();
            int cardPlayerTwo = Integer.parseInt(command);

            if (cardPlayerOne > cardPlayerTwo) {
                playerOnePoints += Math.abs(cardPlayerOne - cardPlayerTwo);
            } else if (cardPlayerTwo > cardPlayerOne) {
                playerTwoPoints += Math.abs(cardPlayerOne - cardPlayerTwo);
            } else {
                System.out.println("Number wars!");
                command = scanner.nextLine();
                cardPlayerOne = Integer.parseInt(command);
                command = scanner.nextLine();
                cardPlayerTwo = Integer.parseInt(command);
                if (cardPlayerOne > cardPlayerTwo) {
                    System.out.printf("%s is winner with %d points", playerOneName, playerOnePoints);

                } else {
                    System.out.printf("%s is winner with %d points", playerTwoName, playerTwoPoints);
                }
                break;
            }
        }
    }
}

