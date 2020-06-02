package practice;
class Parent1{
	int i=10;
	static String name="Hitesh";
	
}
class Child1 extends Parent1{
	int i=20;
	static String name="mona darling";
	
	public void show()
	{
		System.out.println("i is :"+i);
		System.out.println("i is :"+super.i);
		System.out.println("name is :"+name);
		System.out.println("name is :"+Parent1.name);
	}
}
public class Supervar {
	public static void main(String[]args)
	{
		Child1 c=new Child1();
		c.show();
	}

}
