package numberconverter;

import java.util.Scanner;

public class NumberConverter {

    public static void main(String[] args) {
    Scanner mariakey = new Scanner (System.in);
       System.out.print("Please enter a 4 digits Octal number: ");
       String octalNumberValue = mariakey.nextLine();
       
       char firstValue= octalNumberValue.charAt(0);
       char secondValue= octalNumberValue.charAt(1);
       char thirdValue= octalNumberValue.charAt(2);
       char fourthValue= octalNumberValue.charAt(3);

       int integerFirstValue =((int)firstValue-(int)'0');
       int integerSecondValue =((int)secondValue-(int)'0');
       int integerThirdValue =((int)thirdValue-(int)'0');
       int integerFourthValue =((int)fourthValue-(int)'0');

              int decimalNumberValue = (integerFirstValue * (int) Math.pow(8, 3)) +
                          (integerSecondValue * (int) Math.pow(8, 2)) +
                          (integerThirdValue * (int) Math.pow(8, 1)) +
                          (integerFourthValue * (int) Math.pow(8, 0));
        
       
       System.out.printf("\nOctal number %6s %s",":", octalNumberValue);
       System.out.printf("\nDecimal number %4s %d \n",":", decimalNumberValue);
    }
    
}
