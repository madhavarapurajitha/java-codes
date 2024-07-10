import java.util.Scanner;

abstract class shape1 {
    abstract void area();
    }
class circle1 extends shape1{
     void area(){
          Scanner s=new Scanner(System.in);
          int r=s.nextInt();
          float area=3.14f*r*r;
          System.out.printf("\ncircle:%f",area);
     }
}
class rectangle1 extends shape1{
    void area(){
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        int area=l*b;
        System.out.printf("\nrectangle:%d",area);
    }
}
    public class ab {
        public static void main(String[] args) throws Exception{
            circle1 c=new circle1();
            c.area();
            rectangle1 r=new rectangle1();
            r.area();
        }
    
}
