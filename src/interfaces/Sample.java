package oops.interfaces;

import java.util.Scanner;

interface Shape {
    double area();
     double draw();
    double move();
    double rotate();

}

class Rectangle implements Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {

        return length * breadth;
    }

    @Override
    public double draw() {

        return 2 * (length + breadth);
    }
    @Override
    public double move() {
        System.out.println("Move Rectangle from one point to another");
        return length;
    }
    @Override
    public double rotate() {

        System.out.println("Rotate the Rectangle");
        return area();
    }
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

 @Override
    public double draw() {

        return 2 * Math.PI * radius;
    }
    @Override
    public double move() {

      System.out.println("Move circle from one point to another");
        return radius;
    }
    @Override
    public double rotate() {

        System.out.println("Rotate the circle");
        return radius;
    }
}


public class Sample {

    public static void main(String[] args) {
        // Rectangle area and parameter
        Scanner sc = new Scanner(System.in);
        System.out.println("******Calculate area of rectangle and draw the the rectangle using different values******");

        System.out.println("\nEnter the value of length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the value of breadth : ");
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("Rectangle - Area: " + r.area());
        System.out.println("Rectangle - draw: " + r.draw());
        System.out.println("Rectangle - move: " + r.move());
        System.out.println("Rectangle - rotate: " + r.rotate());

        System.out.println("\nEnter the value of length : ");
        double length1 = sc.nextDouble();
        System.out.println("Enter the value of breadth : ");
        double breadth1 = sc.nextDouble();
        Rectangle r1 = new Rectangle(length1, breadth1);
        System.out.println("Rectangle - Area: " + r1.area());
        System.out.println("Rectangle - draw: " + r1.draw());
        System.out.println("Rectangle - move: " + r1.move());
        System.out.println("Rectangle - rotate: " + r1.rotate());

        System.out.println("\nEnter the value of length : ");
        double length2 = sc.nextDouble();
        System.out.println("Enter the value of breadth : ");
        double breadth2 = sc.nextDouble();
        Rectangle r2 = new Rectangle(length2, breadth2);
        System.out.println("Rectangle - Area: " + r2.area());
        System.out.println("Rectangle - draw: " + r2.draw());
        System.out.println("Rectangle - move: " + r2.move());
        System.out.println("Rectangle - rotate: " + r2.rotate());

        // Circle area and parameter
        System.out.println("******Calculate area of circle and draw the the circle using different values******");

        System.out.println("\nEnter the value of radius : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("Circle - Area: " + c.area());
        System.out.println("Circle - draw: " + c.draw());
        System.out.println("Circle - move: " + c.move());
        System.out.println("Circle - rotate: " + c.rotate());

        System.out.println("\nEnter the value of radius : ");
        double radius2 = sc.nextDouble();
        Circle c1 = new Circle(radius2);
        System.out.println("Circle - Area: " + c1.area());
        System.out.println("Circle - draw: " + c1.draw());
        System.out.println("Circle - move: " + c1.move());
        System.out.println("Circle - rotate: " + c1.rotate());

   }
}