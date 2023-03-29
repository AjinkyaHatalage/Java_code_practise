package Practise_java;
import java.lang.Thread;
public class multiThreadingBookExample {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
       // System.out.println(t); // op -> Thread[#1,main,5,main]
        System.out.println("current thread is := "+t);
        // change the name of thread
        t.setName("my Thread");
        System.out.println("After name change := "+t);
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("my Thread is interupted");
        }

    }
}
/* output
current thread is := Thread[#1,main,5,main]
After name change := Thread[#1,my Thread,5,main]
5
4
3
2
1

*/