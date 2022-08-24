package Homework.Exercises11;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("stop")) {

            System.out.println(input);
            input = scan.nextLine();

        }


    }
}
