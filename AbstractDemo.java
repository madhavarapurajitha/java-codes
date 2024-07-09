abstract class one{
    abstract void add(int a,int b);
    void sub(int a,int b){
        System.out.printf("%d - %d = %d",a,b,(a-b));
    }
}
class child extends one{
    void add(int a,int b){
        System.out.printf(" %d + %d = %d",a,b,(a+b));
    }
}
public class AbstractDemo{
    public static void main(String[] args){
        child c=new child();
        c.add(5,6);
        c.sub(6,5);
    }
}