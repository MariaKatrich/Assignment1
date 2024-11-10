package balancecalculator;

import java.util.Scanner;

public class BalanceCalculator {

    public static void main(String[] args) {
    Scanner mkey = new Scanner (System.in); 
    
    System.out.print("Please enter the initial balance: "); 
    double initialBalance = mkey.nextDouble(); 
    System.out.print("Please enter the annual interest rate (2 for 2%): "); 
    double annualInterestRate = mkey.nextDouble(); 
    System.out.print("Please enter the number of years the client wants to save the money in the bank: "); 
    int savingYears = mkey.nextInt(); 
    double finalBalance = initialBalance * Math.pow(1 + (annualInterestRate / 100), savingYears); 
    System.out.printf("%-22s: %.2f\n", "Initial Balance", initialBalance); 
    System.out.printf("%-22s: %7.2f%%\n", "Annual Interest Rate", annualInterestRate); 
    System.out.printf("%-22s: %8d\n", "Saving Years", savingYears); 
    System.out.println("-------------------------------------"); 
    System.out.printf("%-22s: %.2f\n", "Balance After " + savingYears + " Years", finalBalance);
    }
    
}
