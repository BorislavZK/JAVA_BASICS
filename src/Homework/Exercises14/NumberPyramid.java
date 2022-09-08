package Homework.Exercises14;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int currentNumber = 1;
        boolean flag = false;

        for ( int rows =1; rows <=n; rows++){
            for (int cols =1; cols <= rows; cols++){
                if (currentNumber > n ){
                    flag = true;
                    break;
                }

                System.out.print(currentNumber + " ");
                currentNumber++;

            }

            if(flag){
                break;
            }
            System.out.println();
        }
    }
}
