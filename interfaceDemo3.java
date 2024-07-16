interface Shape{
    void draw();
}
class Rectangle implements Shape{
    public void draw(){
     System.out.println("Rectangle is drawn");
    }
}
class Circle implements Shape{
       public void draw(){
        System.out.println("circle is drawn");
       }
}
class Demo{
    static Shape getShape(int n){
        Shape s=null;
        if(n==1)
            new Rectangle();
        else if(n==2)
            new Circle();
        return s;
    }
}
public class interfaceDemo3 {
    public static void main(String[] args){
           Shape s1=Demo.getShape(1);
           Shape s2=Demo.getShape(2);
           s1.draw();
           s2.draw();
    }
    
}
