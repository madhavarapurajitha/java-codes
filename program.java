class Houseplan{
    static String city;
    byte kn;
    short pr;
    int br1,br2;
    static{
        System.out.println("static block");
        city="vijayawada";
    }
    {
        System.out.println("instance");
    }
    Houseplan() {
        System.out.println("constructor");
    }
    void Room(){
        System.out.println("instance method");
    }
    static void fun1(){
        System.out.println("static method");
    }
}
public class program{
    public static void main(String[] args){
        Houseplan p1=new Houseplan();
        System.out.println("object state");
        System.out.println(p1.kn);
        System.out.println(p1.pr);
        System.out.println(p1.br1);
        System.out.println(p1.br2);
    }
}