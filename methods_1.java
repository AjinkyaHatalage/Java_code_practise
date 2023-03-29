package challenges.games;

import java.util.Scanner;

public class methods_1 {
    static int facto(int n){
      if(n==0 || n==1)
      {
          return  1;
      }
      else {
          return n*facto(n-1);
      }
    }
    public static void main(String[] args)
    {
      System.out.println("Enter the number : ");
      Scanner scanner = new Scanner(System.in);
       int n=scanner.nextInt();
      System.out.println(facto(n));
    }
}
