package TESTS;

import java.util.Scanner;

public class ForLoopAndString_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        int length = text.length();
        String reverse = "";


        // OT PURVI KUM POSLEDEN ZNAK

        //for (int i = 0; i < length ; i++) {
         //   System.out.println(text.charAt(i));

        //}



        // REVERSE STRING    -- length - 1  dava posledniq simvol na stringa
        for (int i = length -1 ; i >= 0 ; i--) {
            //System.out.println(text.charAt(i));
            reverse += (text.charAt(i));
        }

        System.out.println(reverse);
    }
}
