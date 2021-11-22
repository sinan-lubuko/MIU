package w2d4;

public class ShapeMainApp {

    public static void main(String[] args){
     Circle c = new Circle(4);
     Rectangle r = new Rectangle(4, 3);
     showArea(c);
     showArea(r);
    }

    //helper method
    public static void showArea(Shape s){
        double area = s.area(); //polymorphism
        System.out.println("Area of the shape is "+area);
    }
}
