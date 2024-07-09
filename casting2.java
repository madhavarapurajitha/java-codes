class Base
{
    int a=100;
    int b=200;
    static void fun1(){
        System.out.println("base static fun");
    }
    void display(){
        System.out.println("base instance method");
    }
}
class Child extends Base{
    int a=1000;
    int b=2000;
    static void fun1(){
        System.out.println("child static fun");
    }
    void display(){
        System.out.println("child instance block");
    }

}
    public class casting2 {
        public static void main(String[] args) throws Exception{
            Base b=new Child();
            Child c=(Child)b;
            System.out.println(b.a);
            System.out.println(b.b);
            System.out.println(c.a);
            System.out.println(c.b);
            b.fun1();
            c.fun1();
            b.display();
            c.display();
        }
}
