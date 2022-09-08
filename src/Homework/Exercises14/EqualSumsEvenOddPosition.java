package Homework.Exercises14;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evensum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {

                    evensum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }


            }

            if (oddSum == evensum) {
                System.out.print(i + " ");
            }
        }


    }
}
