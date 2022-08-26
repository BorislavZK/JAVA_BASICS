package TESTS;

import java.util.Scanner;

public class whileLoopTest_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equals("stop")){

            input = scan.nextLine();
            System.out.println(input); // принтираме СТОП като размениме местата на input и println и стринга в началото е равен на ""




        }


    }
}
