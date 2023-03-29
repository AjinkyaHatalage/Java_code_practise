package Practise_java;
/*We can use super keyword to access the data member
 or field of parent class. It is used if parent class
 and child class have same fields.
*/
class animal{
    String color="white";
}
class dog extends animal{
    String color="black";
    void printcolor(){
        System.out.println(color);//print the color of Dog class
        System.out.println(super.color);// print color of animal class
    }
}
/*
black
white

*/
public class superKeyword {
    public static void main(String[] args) {
         dog d=new dog();
         d.printcolor();
    }
}
