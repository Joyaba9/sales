/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.sales;

/**
 *
 * @author EL GUARDIAN
 * 
 *
 */


import java.util.Scanner;

public class Sales {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productNumber;
        int quantitySold;
        double retailPrice;
        double totalRetailValue = 0.0;
        
        String formattedNumber = String.format("%.2f", totalRetailValue);
        System.out.println(formattedNumber);
        
        
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter product number and quantity sold:");
            productNumber = input.nextInt();
            quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    retailPrice = 2.98;
                    break;
                case 2:
                    retailPrice = 4.50;
                    break;
                case 3:
                    retailPrice = 9.98;
                    break;
                case 4:
                    retailPrice = 4.49;
                    break;
                case 5:
                    retailPrice = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number");
                    retailPrice = 0.0;
                    break;
            }

            totalRetailValue += retailPrice * quantitySold;
        }

        System.out.println("Total retail value: $" + totalRetailValue);
        input.close();
    }
}