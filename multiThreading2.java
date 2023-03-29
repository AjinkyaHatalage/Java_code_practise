package Practise_java;

class hi extends  Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi ");
            try{Thread.sleep(1000);}
            catch(Exception e){System.out.println(e);}
        }

    }
}
class hello extends  Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello ");
            try{Thread.sleep(1000);}
            catch(Exception e){System.out.println(e);
        }

        }
    }
}
public class multiThreading2 {
    public static void main(String[] args) {
        hi obj1=new hi();
        hello obj2=new hello();

        obj1.start();
        obj2.start();
    }
}
