import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scannerSubtotal = new Scanner(System.in);
        Scanner scannertipRate = new Scanner(System.in);
        System.out.println("Enter the subtotal:");
        double subtotal = scannerSubtotal.nextDouble();
        System.out.println("Enter the tip rate (%):");
        double tipRate = scannertipRate.nextDouble();
        double tips = (subtotal*tipRate)/100;
        double total = subtotal+tips;
        System.out.println("Tip is $" + tips + " and total is $" + total);
        scannerSubtotal.close();
        scannertipRate.close();
    }
}