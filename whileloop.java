package challenges.SalaryCalculator;

import java.util.Scanner;

public class whileloop {

    public static void main(String[] args)
    {
        //while loop
        int payrate= 15;
        int maxHours = 40;

        //get input .
        System.out.println("How many hrs the employee work this  week ?");
        Scanner scanner=new Scanner(System.in);
        double hoursWorked =scanner.nextDouble();
       // validate input
         while (hoursWorked > maxHours)
         {
             System.out.println("Invalid entry . yor hrs must be between 1 and 40 .try again  ");
             hoursWorked = scanner.nextDouble();
         }
        scanner.close();
        // calculate gross
        double gross =payrate *hoursWorked;
        System.out.println("Gross pay : $"+gross);

    }
}
