package Practise_java;
// Annotation
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int value() ;// this variable name must be value
}
public class Single {
    // Annotate a method using a single-member annotation.
    @MySingle(100)
    public static void myMeth(){
        Single ob=new Single();
        try{
            Method m =ob.getClass().getMethod("myMeth");
            MySingle anno= m.getAnnotation(MySingle.class);
            System.out.println(anno.value()); //displays 100
        }
        catch (NoSuchMethodException exc){
            System.out.println("method not found");
        }
    }
    public static void main(String[] args) {
     myMeth();
    }
}
