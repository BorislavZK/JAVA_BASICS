package TESTS;

import java.util.Scanner;

public class whileLoopTest_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("stop")){
            int number = Integer.parseInt(scan.nextLine());

            System.out.println(input + " print");
            System.out.println(number + " print");

            input = scan.nextLine();

            if (input.equals("stop")){
                System.out.println("STOP" + " print");
            }

        }


    }
}


