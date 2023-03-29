package Practise_java;
import  java.lang.*;
import java.util.Random;

public class exceptionHandle2 {
    public static void main(String[] args) {

     Random r= new Random();

     for(int i=0;i<10;i++) {
         int a = r.nextInt();
         int b = r.nextInt();
         int c = r.nextInt();

             System.out.println(a + "  " + b + "  " + c);

     }
    }
}