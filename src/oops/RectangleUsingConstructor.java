package oops;

class Rectangle{
    double length ,breadth,area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        area = length * breadth;
        System.out.println("Area of triangle : "+ area);
    }
}

public class RectangleUsingConstructor {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(3,5);
        rect.area();
       }
}
