package Homework.Exercises8;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double n1 = Integer.parseInt(scan.nextLine());
        double n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();


        double addition = n1 + n2;
        double subtraction = n1 - n2;
        double multiplication = n1 * n2;
        double division = n1 / n2;
        double modulus = n1 % n2;
        String oddEven = "";


        switch (operator) {
            case "+":
                if (addition % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%.0f + %.0f = %.0f - %s", n1, n2, addition, oddEven);
                break;

            case "-":
                if (subtraction % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%.0f - %.0f = %.0f - %s", n1, n2, subtraction, oddEven);
                break;

            case "*":
                if (multiplication % 2 == 0) {
                    oddEven = "even";
                } else {
                    oddEven = "odd";
                }
                System.out.printf("%.0f * %.0f = %.0f - %s", n1, n2, multiplication, oddEven);
                break;

            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero %n", n1);
                } else {
                    System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, division);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero %n", n1);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, modulus);
                }
                break;

            default:
                break;
        }
    }
}
