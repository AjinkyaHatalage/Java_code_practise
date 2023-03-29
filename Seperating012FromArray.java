package challenges.practices.Array;

public class Seperating012FromArray {
    public static void main(String[] args) {
        int arr[]={0,2,2,1,0,0,1,2,0,1};
        int size=arr.length;
        System.out.println(size);
        int count0=0, count1=0, count2=0;
        for(int i:arr)
        {
            if(i==0)
            {
                count0++;
            }
            if(i==1)
            {
                count1++;
            }
            if(i==2)
            {
                count2++;
            }
        }
        System.out.println("The Number of 0s := "+count0);
        System.out.println("The Number of 1s := "+count1);
        System.out.println("The Number of 2s := "+count2);
    }
}
