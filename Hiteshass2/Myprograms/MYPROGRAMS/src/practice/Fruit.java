package practice;

public class Fruit {
	String name;
	public Fruit() {
		name="mango";
		System.out.println(name);
	}
	
	public static void main(String[]args)
	{
		Fruit f=new Fruit();
		System.out.println(f.name);
	}
}
