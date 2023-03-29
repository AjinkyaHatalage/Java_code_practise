package challenges.SalaryCalculator;

import java.util.Scanner;
// switch Expressions
public class switchstatements {
    public static void main(String[] args)
    {
       System.out.println("Enter the grade :");
       Scanner scanner=new Scanner(System.in);
       String grade = scanner.next();
       scanner.close();

       String message= switch(grade)
       {
           case "A" ->"Excellent Job";

           case "B" ->"Great job";

           case "c" ->"Average Job";

           default -> "oridinary Job";
       };
       System.out.println("Quality of work is "+message);
    }
}
