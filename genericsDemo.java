package Practise_java;
// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class gen<T>{
    T ob;// declare an object of type T
    // Pass the constructor a reference to
// an object of type T.
    gen(T o)
    {
        ob=o; // constructor
    }
    // RETURN ob
    T getob(){
        return ob;
    }
    // Show type of T.
    void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}
public class genericsDemo {
    public static void main(String[] args) {
// Create a Gen reference for Integers.
    gen<Integer>iob;
// Create a Gen<Integer> object and assign its
// reference to iOb. Notice the use of autoboxing
// to encapsulate the value 88 within an Integer object.
        iob=new gen<Integer>(88);
        // show the type of data used by iob.
        iob.showType();
        // Get the value in iOb. Notice that
// no cast is needed.
        int v=iob.getob();
        System.out.println("Value : "+v);
        System.out.println();
        // Create a Gen Object for Strings.
        gen<String>strob=new gen<String>("Generic Test");
        //Show the type of data used by strob.
        strob.showType();
        //Get the value of strob . Again , Notice
        //that no cast is needed
        String str = strob.getob();
        System.out.println("value: "+ str);
    }
}
/* OutPut :-
Type of T is java.lang.Integer
Value : 88

Type of T is java.lang.String
value: Generic Test
*/
