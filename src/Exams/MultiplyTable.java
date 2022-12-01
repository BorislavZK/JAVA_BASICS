package Exams;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        int reverse = 0;
        int first = 0;
        int second = 0;
        int third = 0;

        int product = 0;

        for (int i = 0; i <= 2; i++) {

            reverse = input % 10;

            if (i == 0) {
                first = reverse;
            } else if (i == 1) {
                second = reverse;
            } else {
                third = reverse;
            }

            input /= 10;

        }

        for (int j = 1; j <= first; j++) {
            for (int k = 1; k <= second ; k++) {
                for (int l = 1; l <= third ; l++) {

                    product = j * k * l;

                    System.out.printf("%d * %d * %d = %d;\n", j, k, l, product);


                }

            }

        }

    }

}

