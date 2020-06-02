package exejava;

public class TheRectangle {
	
	private float length;
	private float width;
	public TheRectangle()
	{
		length=20;
		length=94;
	}
	public TheRectangle(float length, float width) {
		
		this.length = length;
		this.width = width;
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
	@Override
	public String toString() {
		return "TheRectangle [length=" + length + ", width=" + width + "]";
	}
	
	public float areaRec()
	{
		return length*width;
	}
	
	
	public static void main(String[]args)
	{
		TheRectangle t=new TheRectangle();
		System.out.println(t);
		
		TheRectangle s=new TheRectangle(20,30);
		System.out.println(s);
		System.out.println("Area is :"+s.areaRec());
		s.setLength(50);
		s.setWidth(87);
		
		System.out.println("Area is :"+s.getLength()+"\n"+" : "+s.getWidth());
	}
	
		
}
