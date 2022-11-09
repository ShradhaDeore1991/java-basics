package oops.interface2;

import java.awt.*;

public class Tomato implements Fruit,Vegitables
{
    public void hasAPeel()
    {
        System.out.println("Details of Fruit");
    }

    public void hasARoot()
    {
        System.out.println("Details of Vegetable");
        System.out.println("Choose type of Vegetable");
    }
}
class Main{
    public static void main(String[] args) {

        Tomato t = new Tomato();
        System.out.println(t);

        t.hasAPeel();
        t.hasARoot();
    }
    void show() {
        System.out.println("Welcome to program");
    }

}