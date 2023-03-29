package Practise_java;

class myThread extends Thread{
    int [] values={6,1,7,8};
    int size=values.length;
     public void run()
    {

        for(int i=0;i<4;i++)
        {

            values[i] *= 2;

            try{
                size=i;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e+" -> ");
            }
            System.out.println("In Mythread :");
        }
    }
}

public class multiThreadingInjava {
    public static void main(String[] args) {
        Thread t1=new myThread();
        t1.run();

    }
}
