package Homework.Exercises9;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n ; i++) {
            int element = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0 ){
                evenSum += element;
            }else {
                oddSum += element;
            }
            
        }
        
    }

}




