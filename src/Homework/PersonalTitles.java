package Homework;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        switch (gender){
            case "m":
                if (age >= 16){
                    System.out.println("Mr.");
                }else{
                    System.out.println("Master");
                }
                break;
            case "f":
                if (age >= 16){
                    System.out.println("Ms.");
                }else{
                    System.out.println("Miss");
                }
                break;
        }

    }
}
