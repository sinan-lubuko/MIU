package Chapter5;

public class Rectangle {
    public double length;
    public double width;
    public double area;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double perimeter;

    public Rectangle(){
        length = 0.0;
         width = 0.0;
    }
    public Rectangle(double len,double wid){
        length = len;
         width  = wid;
    }

    public double area(double length,double width){
        area = length * width;
        return  area;
    }

    public double perimeter ( double len, double width) {
        perimeter = 2 * (length + width);
        return  perimeter;
    }
}