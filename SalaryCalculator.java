package challenges.SalaryCalculator;

import java.util.Scanner;

/*
usuage of if else*/
public class SalaryCalculator {
    public static  void main(String[] args)
    {
        // initializing known values
        int salary =1000;
        int bonus =250;
        int quota=10;
        //get values from unknown
        System.out.println("How many sales did the employee made in this week ?");
        Scanner scanner=new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //quick detour for the bonus earner
        if(sales > quota)
        {
            salary+=bonus;
        }
        else {
            salary = salary+sales;
        }
        System.out.println("the Employees pay's is $ " +salary);
    }
}
