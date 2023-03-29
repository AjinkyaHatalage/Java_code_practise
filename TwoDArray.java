package challenges.practices;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int size;
        Scanner sc= new Scanner(System.in);
        size=sc.nextInt();
        int arr[][]=new int[size][size];
       /* for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        } */
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
