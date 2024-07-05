class Base
{
    int a,b;
    Base(int a,int b)
    {
        System.out.println("base parameterized constuctor");
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("object state");
        System.out.println(a);
        System.out.println(b);
    }
}
class Child extends Base{
    int c,d;
    Child(int c,int d)
    {
        super(10,20);
        this.c=c;
        this.d=d;
        System.out.println("child constructor");
    }
    void display2()
    {
        System.out.println("object state");
        System.out.println(c);
        System.out.println(d);
    }
}
public class Simple{
    public static void main(String[] args){
        Child  c=new Child(100,200);
        c.display();
        c.display2();

    }
}

