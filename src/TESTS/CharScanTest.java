package TESTS;

import java.util.Scanner;

public class CharScanTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char charTest = scan.nextLine().charAt(0);

        System.out.printf("Print char: %c", charTest);
    }
}
