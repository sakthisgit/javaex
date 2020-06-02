class Circle
{
	private double radius;
	private String color;
	
	public Circle()
	{
		radius = 2.0;
		color = "blue";
	}
	
	public Circle(double r)
	{
		radius=r;
		color="red";
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
}
public class Test_Circle {
public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println("the Circle has radius of  "
			+c.getRadius()+" and area of "+ c.getArea());
	
	Circle c1=new Circle(5.0);
	System.out.println("the circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
}
}
