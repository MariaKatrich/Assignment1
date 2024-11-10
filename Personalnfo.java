package personalnfo;

import java.util.Scanner;

public class Personalnfo {

    public static void main(String[] args) {
        
    Scanner mariakeyboard = new Scanner ( System.in);
        System.out.print ("Please enter your name: ");
        String nameValue = mariakeyboard.nextLine();
        System.out.print ("Please enter your age: ");
        int ageValue = (int) mariakeyboard.nextInt();
        mariakeyboard.nextLine();
        System.out.print ("Please enter your gender: ");
        String genderValue = mariakeyboard.nextLine();
        System.out.print ("Please enter your department: ");
        String departmentValue = mariakeyboard.nextLine();
        System.out.print ("Please enter the value pf PI (3.1415826): ");
        double PIValue = mariakeyboard.nextDouble();
        
        System.out.printf("\nName %11s %s \n",":", nameValue );
        System.out.printf("Age %12s %d \n",":", ageValue);
        System.out.printf("Gender %9s %s \n",":", genderValue);
        System.out.printf("Department %5s %s \n",":", departmentValue);
        System.out.printf("PI %13s %4.2f \n",":", PIValue);    

    }
    
}
