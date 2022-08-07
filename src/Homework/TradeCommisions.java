package Homework;

import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double percent = 0;

        switch (town){
            case "Sofia":
                if (sales >= 0 && sales <= 500){
                    percent = 0.05;
                }else if (sales > 500 && sales <= 1000){
                    percent = 0.07;
                }else if (sales > 1000 && sales <= 10000){
                    percent = 0.08;
                }else if (sales > 10000){
                    percent = 0.12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500){
                    percent = 0.045;
                }else if (sales > 500 && sales <= 1000){
                    percent = 0.075;
                }else if (sales > 1000 && sales <= 10000){
                    percent = 0.10;
                }else if (sales > 10000){
                    percent = 0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500){
                    percent = 0.055;
                }else if (sales > 500 && sales <= 1000){
                    percent = 0.08;
                }else if (sales > 1000 && sales <= 10000){
                    percent = 0.12;
                }else if (sales > 10000){
                    percent = 0.145;
                }
                break;
        }
        if (percent == 0 ){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", sales * percent);
        }


    }
}
