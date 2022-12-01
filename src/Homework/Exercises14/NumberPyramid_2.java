package Homework.Exercises14;

import java.util.Scanner;

public class NumberPyramid_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        int currentNum = 0;

        for (int rows = 1; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                currentNum ++;
                System.out.print(currentNum);

            }

            System.out.println();

        }

    }
}
