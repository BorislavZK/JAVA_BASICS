package Homework.Exercises14;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scan.nextLine();

        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }

            boolean flag = true;

            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    flag = false;
                    nonPrimeSum += number;
                    break;
                }
            }

            if (flag) {
                primeSum += number;
            }

            input = scan.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeSum);


    }
}
