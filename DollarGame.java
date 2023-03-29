package challenges.games;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args){
        double penny=.01;
        double nickel=.05;
        double dime=.10;
        double quarter=.25;
        int dollar=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to change for dollor"+ "Your goal is is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennis: ");
        int numsofpennis=scanner.nextInt();
        System.out.println("Enter your number of nickels :");
        int numsofnickels=scanner.nextInt();
        System.out.println("Enetr the number of dimes");
        int numsofdimes=scanner.nextInt();

        System.out.println("Enter the numbers of quarter :");
        int numsofquarters=scanner.nextInt();

        scanner.close();

        double Total = numsofpennis * penny + numsofdimes * dime + numsofnickels *nickel + numsofquarters*quarter;

        if(Total < dollar)
        {
            double amountShort=dollar -Total;
            //way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose ! You were short"+String.format("%2f",amountShort));

        } else if (Total>dollar) {
             double amountover= Total -dollar;
            System.out.println("eureka ,yor toal is greater than dolaor , but you not win"+ String.format("%2f",amountover));
        }
        else{
            System.out.println("Yes its exactly one dollar ,You win");
        }

    }
}
