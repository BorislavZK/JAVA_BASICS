package TESTS;

import java.util.Scanner;

public class whileLoopTest_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        while (num <= 100) {

            int num2 = Integer.parseInt(scan.nextLine());
            num += num2;

            if (num >= 100) {
                System.out.println("100 is reached!");
                break;
            }
        }


    }
}


