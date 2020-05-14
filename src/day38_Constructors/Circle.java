package day38_;

public class Circle {
    double radius;
    double pi=3.14;
    double diameter =2*radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
      double area = pi*radius*radius;
      return area;
    }

    public double perimeter(){
        double perimeter = pi*diameter;
        return perimeter;
    }


    public String toString(){
        return "Radius is: "+radius+", area is: "+area()+", perimeter is: "+perimeter();
    }






}
