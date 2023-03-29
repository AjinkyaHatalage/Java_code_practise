package Practise_java;
// Compute the hypotenuse of a right triangle.
// static  import (before generics)part I
import static  java.lang.Math.*;
public class importStatic {
    public static void main(String[] args) {
        double side1=3.0,side2=4.0,hypot;
       // Notice how sqrt() and pow() must be qualified by
       // their class name, which is Math.
       hypot =Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.println("Given Sides of lengths"+side1+"and"+side2+"the hypotenuse is "+hypot);
    }
}
/*Output :->
Given Sides of lengths3.0and4.0the hypotenuse is 5.0
*/