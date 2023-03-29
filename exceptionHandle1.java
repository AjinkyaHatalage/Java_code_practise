package Practise_java;
import  java.lang.*;
public class exceptionHandle1 {
    public static void main(String[] args) {
        try{
            int data =100/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("reset the code");
        /*
           int d, a;
        try { // monitor a block of code.
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) { // catch divide-by-zero error
            System.out.println("Division by zero.");
            System.out.println(e);
        }
        System.out.println("After catch statement.");

    }
       */
    }
}
