package NTU_EDU;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super();
        this.height = 0.0;
    }
    public Cylinder(double radius) {  super(radius);  }
    public Cylinder(double radius,double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius,String color,double height) {
        super(radius,color);
        this.height = height;
    }
    public String toString()
    {
        return String.format("\n Cylinder: Radius - "+super.getRadius()+",Color - "+super.getColor()+",Height - "+getHeight());
    }
    public double getHeight() { return this.height; }
    public void setHeight(double height) {  this.height = height; }
    public double getVolume() {
        return super.getArea() * this.height;
    }
    public double getArea() {
        //System.out.println("******Calculate Area of Cylinder******");
        return ((2 * Math.PI * super.getRadius() * getHeight()) + (2 * super.getArea()));  // (2*PI*r*h) + (2*Area of circle)
    }
    public double getCircleArea() { return super.getArea(); }
    
}