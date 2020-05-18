package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
 */
public class Circle {
    DecimalFormat df= new  DecimalFormat("0.00");
    double radius;
   static double pi=3.14;
    double diameter;

    public Circle(double radius){
        this.radius=radius;
        diameter = radius*2;
    }
    public double area(){
      return  pi*radius*radius;

    }
    public double perimeter(){
        return pi*diameter;
    }

    public String toString(){
        return "Radius is: "+radius+", area is: "+df.format(area())+", perimeter is: "+perimeter();
    }
}

class CircleObject{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter a radius of circle");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);
        double areaOfCircle1 = circle1.area();
        System.out.println("Area of circle is: "+df.format(areaOfCircle1));
        System.out.println(circle1);
    }
}