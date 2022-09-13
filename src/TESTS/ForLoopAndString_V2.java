package TESTS;

import java.util.Scanner;

public class ForLoopAndString_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int length = text.length();

        for (int i = 0; i < length ; i++) {
            System.out.println(text.charAt(i));

        }
    }
}
