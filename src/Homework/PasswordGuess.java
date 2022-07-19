package Homework;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = "s3cr3t!P@ssw0rd";
        String b = scan.nextLine();

        if (a.equals(b)) {
            System.out.println("Welcome");
        }else{
            {
                System.out.println("Wrong password!");

            }
        }
    }
}
