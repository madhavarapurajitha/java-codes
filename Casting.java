class Base
{
    int a=100;
    int b=200;
    static void fun1(){
        System.out.println("static fun");
    }
    void display(){
        System.out.println("instance method");
    }
}
class Child extends Base{
    int a=1000;
    int b=2000;
    static void fun1(){
        System.out.println("static fun");
    }
    void display(){
        System.out.println("instance block");
    }

}
    public class Casting {
        public static void main(String[] args) throws Exception{
            Base b=new Child();
            System.out.println(b.a);
            System.out.println(b.b);
            b.fun1();
            b.display();
        }
}

