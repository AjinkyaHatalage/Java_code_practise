package challenges.practices.Array;

class facto{
    int facto(int a)
    {
        int ans;
        if(a==1) return 1;
        ans=a*facto(a-1);
        return ans;
    }

}
public class recusion {
    public static void main(String [] args)
    {
        facto ft=new facto();
        System.out.println("facto of 3 := "+ft.facto(3));
        System.out.println("facto of 4 := "+ft.facto(4));
        System.out.println("facto of 5 := "+ft.facto(5));

    }
}
