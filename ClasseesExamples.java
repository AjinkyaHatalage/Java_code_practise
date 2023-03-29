package challenges.practices.Array;
class box{
    int height=10;
    int width=5;
    int breadth=2;
}
public class ClasseesExamples {
    public static  void main(String[] args)
    {
        box b = new box();
        box b2=new box();

        int ans,answer;
        ans=b.height*b.breadth* b.width;
        System.out.println("Vlo is := "+ans);
        b2.height=10;
        b2.width=10;
        b2.breadth=10;
        answer=b2.height*b2.breadth* b2.width;
        System.out.println("Vol2 is := "+answer);
    }
}
