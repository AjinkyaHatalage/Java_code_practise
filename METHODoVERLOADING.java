package Practise_java;
// Polymorphism -> method overloading
/*In this example, we have created two methods,
 first add() method performs addition of two
 numbers and second add method performs addition
  of three numbers.
In this example, we are creating static methods
so that we don't need to create instance for
calling methods.
*/
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}

    static double add(double a,double b){return  a+b;}
}
public class METHODoVERLOADING {
    public static void main(String[] args) {
        Adder adder=new Adder();
       int ans= adder.add(4,5);
        System.out.println(ans);
        System.out.println(Adder.add(12,34));
        System.out.println(Adder.add(3,5,6));
        System.out.println(Adder.add(23.0,34.4));

    }
}
