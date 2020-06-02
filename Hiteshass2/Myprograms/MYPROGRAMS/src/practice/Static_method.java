package practice;
class Method{
	int id=10;
	static String name="Hitesh";
	static void show()
	{
		Method m=new Method();
		System.out.println(" id is :"+m.id+"\n"+"name is :"+name);
	}
}

public class Static_method {
	static void display()
	{
		System.out.println("name is :"+Method.name);
	}
	void hi()
	{
		System.out.println("Hi");
	}
	public static void main(String[]args)
	{
		Static_method s=new Static_method();
		display();
		Method.show();
		s.hi();
	}
}
