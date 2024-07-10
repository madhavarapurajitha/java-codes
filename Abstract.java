abstract class shape {
    abstract void area();
    }
class circle extends shape{
     void area(){
          int r=5;
          float area=3.14f*r*r;
          System.out.printf("\ncircle:%f",area);
     }
}
class rectangle extends shape{
    void area(){
        int l=5;
        int b=6;
        int area=l*b;
        System.out.printf("\nrectangle:%d",area);
    }
}
    public class Abstract {
        public static void main(String[] args) throws Exception{
            circle c=new circle();
            c.area();
            rectangle r=new rectangle();
            r.area();
        }
    
}
