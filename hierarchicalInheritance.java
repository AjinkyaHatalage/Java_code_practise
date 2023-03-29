package Practise_java;
/*When two or more classes inherits a single class,
 it is known as hierarchical inheritance.
 In the example given below, Dog and Cat classes
  inherits the Animal class,
  so there is hierarchical inheritance.
 */
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}
/* Output ->
meowing...
eating...Animal class
*/