package challenges.practices.Array;
class thisi{
    double length;
    double width;

    thisi(int length,int width)
    {
        //constrctor

            this.length=length;
            this.width=width;

    }
    void display()
    {
        System.out.println(length*width);
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
     thisi th;
     th =new thisi(5,4);
     th.display();
    }
}
