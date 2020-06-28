package practice;

public class Method_overload1 {
	String name="Hitesh";
	public void show()
	{
		System.out.println(name);
	}
	public String show(String name)
	{
		return name;
	}
	public static void main(String[]args)
	{
		Method_overload1 m=new Method_overload1();
	
		System.out.println(m.show("Ashok"));
	}
}
