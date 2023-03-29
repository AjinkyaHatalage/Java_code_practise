package Practise_java;
/*
*In this example, the Drawable interface has only one method.
* Its implementation is provided by Rectangle and Circle classes.
* In a real scenario, an interface is defined by someone else,
* but its implementation is provided by different implementation providers.
* Moreover, it is used by someone else.
* The implementation part is hidden by the user who uses the interface.*/
// interface declaration :  by first user
interface Drawable{
    void draw();
}
// implements by second user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle :");
    }
}
class circle implements Drawable{
    public void draw(){
        System.out.println("drawing Circle :");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Drawable d=new circle();
        d.draw();
        Drawable c=new Rectangle();
        c.draw();
    }
}
/*
op ->
drawing Circle :
Drawing rectangle :*/
