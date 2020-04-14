class Rectangle
{
	private float length;
	private float width;
	public Rectangle()
	{
		length=2.0f;
		width=8.0f;
	}
	public Rectangle(float l,float w)
	{
		this.length=l;
		this.width=w;
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Area=" + getArea() + "]";
	}
	
	
}
public class Test_Rect {
	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle();
		System.out.println(obj);
 		//dynamic initialize
		Rectangle obj1=new Rectangle();
		obj1.setLength(5.0f);
		obj1.setWidth(10.0f);
		System.out.println(obj1);
		
	}
}
