

   package Chapter1;
   import java.util.Scanner;
     public class Rectangle {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int len;
        int breadth;
        int area, perimeter;
        System.out.println("Enter the length of the Rectangle as whole number");
        len = keyboard.nextInt();
        System.out.println("Enter the Beadth of the rectangle as whole number");
        breadth = keyboard.nextInt();
        area = len * breadth;
        perimeter = 2 * (len + breadth);
        System.out.println("The area of a Rectangle " + area);
        System.out.println("The perimeter of the Rectangle" + perimeter);

    }
}
