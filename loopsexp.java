package challenges.SalaryCalculator;

import java.util.Scanner;

public class loopsexp {
    public static void main(String[] args)
    {
        char input='*';
        System.out.println("set the input : ");
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        System.out.println("set the input 2 : ");
        int test2=scanner.nextInt();
        scanner.close();
        if(test >test2) {
            while (test > 0) {
                System.out.println(input);
                test--;
            }
        }

    }

}
