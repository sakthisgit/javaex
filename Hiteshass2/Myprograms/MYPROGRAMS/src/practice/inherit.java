package practice;
class Parent{
	String name="Hitesh";
	public void show()
	{
		System.out.println(name);
	}
}
class Child extends Parent{
	public void show()
	{
		System.out.println(name);
	}
}
public class inherit  {
	public static void main(String[]args)
	{
	Child c=new Child();
	c.show();
	}
}
