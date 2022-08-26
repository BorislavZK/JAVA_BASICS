package TESTS;

import java.util.Scanner;

public class whileLoopTest_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("stop")){

            System.out.println(input);
            input = scan.nextLine();

            if (input.equals("stop")){

                System.out.println("STOP!");
            }

        }


    }
}


