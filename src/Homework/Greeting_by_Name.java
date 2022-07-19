package Homework;


import java.util.Scanner;

public class Greeting_by_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
