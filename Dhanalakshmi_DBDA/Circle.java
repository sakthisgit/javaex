package NTU_EDU;
import java.util.*;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 0.0;
        this.color = "Red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red";
    }
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color= color;
    }
    public double getRadius() { return radius; }
    public String getColor() { return color; }
    
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    public String toString() {
        return String.format("\n Circle: Radius - "+this.radius+",Color - "+this.color);
    }

    public double getArea() {
        //System.out.println("******Calculate Area of Circle******");
        //System.out.println("PI: "+Math.PI);
        //System.out.println("radius square: "+Math.pow(this.radius,2));
        return Math.PI * Math.pow(this.radius, 2);
    }

}