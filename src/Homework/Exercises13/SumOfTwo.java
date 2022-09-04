package Homework.Exercises13;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    isFound = true;

                    break;

                }

            }

            if (isFound) {
                break;

            }

        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }

    }
}
