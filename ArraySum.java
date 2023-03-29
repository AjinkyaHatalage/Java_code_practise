package challenges.practices;

import java.util.Scanner;

public class ArraySum {
    public static void  main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<size;i++)
        {
            ans+=arr[i];
        }
        System.out.println("The sum of all Array Elements :- "+ans);

    }
}
