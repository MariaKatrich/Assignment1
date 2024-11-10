package pricecalculator;

import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {
        Scanner mariakeyboard = new Scanner (System.in);
        
        System.out.print("Please enter the item price: ");
        double itemPriceValue = mariakeyboard.nextDouble();
        System.out.print("Please enter the discount ratio (5 for5%): ");
        double discountRatioValue = mariakeyboard.nextDouble();
        
        
        System.out.printf("\nOriginal Price %5s %f",":", itemPriceValue);
        System.out.printf("\nDiscount Ratio %5s %3.2f%%", ":",  discountRatioValue);
        double priceBeforeTaxValue = itemPriceValue - 0.01 * discountRatioValue * itemPriceValue;
        System.out.printf("\nPrice Before Tax %3s %.2f", ":", priceBeforeTaxValue);
        
        
        System.out.print("\n------------------------------");
        
        double federalTaxValue = priceBeforeTaxValue * 0.05;
        System.out.printf("\nFederal Tax %8s %.2f",":", federalTaxValue );
        double provintialTaxValue = priceBeforeTaxValue * 0.09975;
        System.out.printf("\nProvintial Tax %5s %.2f",":", provintialTaxValue);
        double finalPriceValue = priceBeforeTaxValue + federalTaxValue + provintialTaxValue;
        System.out.printf("\nFinal Price %8s %.2f \n",":", finalPriceValue);
    }
    
}
