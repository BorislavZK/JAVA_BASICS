package Exams;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //•	N – цяло число – 0 <= N < M
        //•	M – цяло число – N < M <= 10000
        //•	S – цяло числo – N <= S <= M

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());


        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (s == i) {
                    break;
                } else {
                    System.out.printf("%d ", i);
                }

                }

            }
        }
    }
