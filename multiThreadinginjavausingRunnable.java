package Practise_java;
class newThread implements Runnable{
 Thread t;
 newThread(){
     t= new Thread(this,"Demo Thread");
     System.out.println("child thread : "+t);
     t.start();//start the thread
 }
 //this is entry point for second thread
    public void run(){
     try{
         for(int i=5;i>0;i--)
         {
             System.out.println("Child Thread "+i);
             Thread.sleep(500);
         }
     }
     catch (InterruptedException e){
         System.out.println("child Interrupted");
     }
        System.out.println("Exiting Child Thread .");
    }
}
public class multiThreadinginjavausingRunnable {
    public static void main(String[] args) {
   new newThread() ; // create a new thread
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("main Thread :"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted .");
        }
        System.out.println("Main Thread Exiting");
    }
}
/*output

child thread : Thread[#23,Demo Thread,5,main]
Child Thread 5
main Thread :5
Child Thread 4
main Thread :4
Child Thread 3
Child Thread 2
main Thread :3
Child Thread 1
Exiting Child Thread .
main Thread :2
main Thread :1
Main Thread Exiting

*/