package Chapter5;

 public class MainClassRectangle {
     public static void main(String []args){
     Rectangle rectangle1 = new Rectangle();
         double area = rectangle1.area(2.5, 1.5);
         System.out.println( "The area of rectangle"+ " " +area);
         double perimeter = rectangle1.perimeter(3.4, 5.5);
         System.out.println("The perimeter of rectangle"+ " "+ perimeter);
         rectangle1.getArea();
         System.out.println(rectangle1.getArea());
         rectangle1.setArea(11.5);
         System.out.println(rectangle1.getArea());
         Rectangle rectangle2 = new Rectangle();
         double area2 = rectangle2.area(4.5,6.7);
         System.out.println("The area of rectangle 2"+ +area2);
         rectangle2.getArea();
         System.out.println(rectangle2.getArea());
         rectangle2.setArea(56.2);
         System.out.println(rectangle2.getArea());
         

       }

    }



