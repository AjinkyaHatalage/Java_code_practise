package Practise_java;
//When there is a chain of inheritance, it is known as multilevel inheritance.
/*
* BabyDog class inherits the Dog class
* which again inherits the Animal class,
* so there is a multilevel inheritance.*/

class  Babydog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Babydog d=new Babydog();
        d.weep();
        d.bark();
        d.eat();
    }
}
/*weeping...
barking...Dog class
eating...Animal class
*/