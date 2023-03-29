package challenges.java_essential;

import challenges.games.DollarGame;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("GrossPay calculator");
        //1 . get the numbers of hours worked
       int  hours=0 ;// default value for initialization
        System.out.println("How  many hrs you work ?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();// modifying defauylt value
        // 2. get the hourly pay rate

        double pay_rate=25.30;
        System.out.println("what is your pay rate ?");
        pay_rate= scanner.nextDouble();
        // close the scanner.
        scanner.close();
        // 3 multiply hrs by payrate
        double grosspay = hours * pay_rate;
        //4 . display resault.
        System.out.println("grosspay :"+grosspay);

    }
}
