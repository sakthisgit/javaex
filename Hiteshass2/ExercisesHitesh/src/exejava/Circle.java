package exejava;
import exejava.Point; 
public class Circle {
	private int radius;
	private Point center;
	
	public Circle(int xCenter, int yCenter, int radius) {
	      center = new Point(xCenter, yCenter);
	      this.radius = radius;
	   }
	
	public Circle(int radius, Point center) {
		super();
		this.radius = radius;
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
	public double getArea()
	{
		return radius*radius;
	}
	
	public static void main(String[]args)
	{
		Circle c=new Circle(12,15,8);
		System.out.println(c);
		
		System.out.println("Area is :"+c.getRadius());
		System.out.println("Area is :"+c.getArea());
	}
	 
}
