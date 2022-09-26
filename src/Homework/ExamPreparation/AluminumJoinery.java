package Homework.ExamPreparation;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String delivery = scan.nextLine();

        double price = 0.0;
        double totalPrice = 0.0;


        switch (type) {

            case "90X130":
                price = 110;
                if (cont > 30 && cont <= 60) {
                    price *= 0.95;
                } else if (cont > 60){
                    price *= 0.92;
                }
                break;

            case "100X150":
                price = 140;
                if (cont > 40 && cont <= 80) {
                    price *= 0.94;
                } else if (cont > 80){
                    price *= 0.90;
                }
                break;

            case "130X180":
                price = 190;
                if (cont > 20 && cont <= 50) {
                    price *= 0.93;
                } else if (cont > 50){
                    price *= 0.88;
                }
                break;

            case "200X300":
                price = 250;
                if (cont > 25 && cont <= 50) {
                    price *= 0.91;
                } else if (cont > 50){
                    price *= 0.86;
                }
                break;
        }

        totalPrice = cont * price;

        if (delivery.equals("With delivery")){
            totalPrice += 60;
        }

        if (cont > 99){
            totalPrice = totalPrice * 0.96;
        }

        if (cont < 10) {
            System.out.println("Invalid order");

        } else {

            System.out.printf("%.2f BGN", totalPrice);

        }




    }
}
