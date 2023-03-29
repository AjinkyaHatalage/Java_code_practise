package challenges.practices.Array;

import static java.lang.Math.abs;

class load{
    void in(){
        System.out.println("0");
    }
    void in(int a){
        System.out.println(a);
    }
    int in(int a,int b){
        return a*b;
    }
}
public class overloading {
    public static void main(String [] args)
    {
        load l = new load();
        l.in(4);
        l.in();
        System.out.println(l.in(4,5));
        System.out.println(abs(-3));

    }
}
