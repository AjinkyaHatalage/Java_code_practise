package Practise_java;
// Method overriding is run time polymorphism
// A Simple Java program to demonstrate
// method overriding in java

// Base Class
class Parent{
    void show(){
        System.out.println("Parents show()");
    }
}
class child extends Parent{
    @Override
    void show() {
        System.out.println("child's show()");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.show();
        Parent obj =new child();
        obj.show();
    }
}
/*
Parents show()
child's show()
*/