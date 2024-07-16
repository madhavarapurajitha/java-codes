interface shape{
    void draw();
}
class Rectangle implements shape{
       public void draw(){
        System.out.println("Rectangle is drawn");
       }
}
class Demo{
    static shape getShape(){
        shape s=new Rectangle();
        return s;
    }
}
public class interfaceDemo2 {
    public static void main(String[] args){
           shape s=Demo.getShape();
           s.draw();
    }
    
}
