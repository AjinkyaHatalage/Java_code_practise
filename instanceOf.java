package Practise_java;
// Demonstrate instanceof operator
class A{
    int i,j;
}
class B{
    int i,j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}
public class instanceOf {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c= new C();
        D d=new D();
        if( a instanceof A)
            System.out.println("a is instance of A");
        if(b instanceof B)
            System.out.println("b is instance of B");
        if(c instanceof C)
            System.out.println("c is instance of C");
        if (c instanceof A)
            System.out.println("c can be cast to A");
        if(a instanceof C)
            System.out.println("a can be cast to C");
        System.out.println();
        // compare types of derived types
        A ob;
        ob=d; // A refeence to d
        System.out.println("ob now refers to d");
        if(ob instanceof D)
            System.out.println("ob is instance of  D");
        System.out.println();

        ob=c; // A reference to c
        System.out.println("ob now refers to c");

        if(ob instanceof D)
            System.out.println("ob can be cast to D");
        else
            System.out.println("ob cannot be  cast to D");

        if(ob instanceof A)
            System.out.println("ob can be cast to A");
        System.out.println();

        // all objects can be cast to Object
        if( a instanceof  Object)
            System.out.println("a may be cast to  object");
        if(b instanceof Object)
            System.out.println("a may be cast to  object");
        if( c instanceof Object)
            System.out.println("a may be cast to  object");
        if(d instanceof Object)
            System.out.println("a may be cast to  object");

    }
}
/* output ->
a is instance of A
b is instance of B
c is instance of C
c can be cast to A

ob now refers to d
ob is instance of  D

ob now refers to c
ob cannot be  cast to D
ob can be cast to A

a may be cast to  object
a may be cast to  object
a may be cast to  object
a may be cast to  object

*/