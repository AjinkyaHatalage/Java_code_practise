package challenges.practices;

class test{
    test(int a,int b)
    {
        System.out.println("value of a and b is before swap := "+a+" "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("value of a and b is after swap := "+a+" "+b);
    }

}
public class CallByValue {
    public static void main(String[] args) {
        int a=6,b=5;
        test t=new test(a,b);

    }
}
