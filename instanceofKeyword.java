package Practise_java;
/*he java instanceof operator is used to test whether the object is an
instance of the specified type (class or subclass or interface).

The instanceof in java is also known as type comparison operator because
it compares the instance with type. It returns either true or false.
 If we apply the instanceof operator with any variable that has null
  value, it returns false.*/
public class instanceofKeyword {
    public static void main(String[] args) {
        instanceofKeyword s=new instanceofKeyword();
        System.out.println(s instanceof instanceofKeyword);
    }
}
// op -> true