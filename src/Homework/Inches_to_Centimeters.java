package Homework;

import java.util.Scanner;

public class Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //умножете инчовете по 2.54 (1 инч = 2.54 сантиметра)

        double inch = Double.parseDouble(scanner.nextLine());
        double cm = inch * 2.54;
        System.out.println(cm);
    }
}
