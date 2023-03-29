package Practise_java;
// enumration values and values of
// use built in enumration methods
// an enumration appple varites
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland  // janathan(9) values
}
public class enumrationValues {
    public static void main(String[] args) {
        Apple ap; // cant create using new
        System.out.println("here are all apple constant :");
        // use values()
        Apple allApples[]=Apple.values();
        for(Apple a:allApples)
        {
            System.out.println(a);
        }

        // use values of
        try {
            ap = Apple.valueOf("Winesap"); // op did with w

            System.out.println("ap contains " + ap);
        }
        catch (Exception e){
            System.out.println("Exception is : "+e);
        }

    }
}
/* OP ->
here are all apple constant :
Jonathan
GoldenDel
RedDel
Winesap
Cortland
Exception is : java.lang.IllegalArgumentException: No enum constant Practise_java.Apple.winesap
*/