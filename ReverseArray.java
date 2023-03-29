package challenges.practices.Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in) ;
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i: arr)
        {
            System.out.print("  " +i);
        }
    }
}
