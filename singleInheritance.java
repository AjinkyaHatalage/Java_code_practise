package Practise_java;
/*When a class inherits another class,
it is known as a single inheritance.
In the example given below, Dog class inherits
the Animal class,
 so there is the single inheritance.*/
class Animal{
    void eat(){
        System.out.println("eating...Animal class");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...Dog class");
    }
}
public class singleInheritance {
    public static void main(String[] args) {
    Dog d= new Dog();
    Animal a=new Animal();
    a.eat();
    d.bark();
    d.eat();
    }
}
/*eating...Animal class
barking...Dog class
eating...Animal class
*/
