package practice;
abstract class Industry11{
	String type;
	Industry11(String i)
	{
		this.type=i;
	}
}
public class Abstract_ITConstructor extends Industry11 {
	String name;
	Abstract_ITConstructor(String type,String name)
	{
		super(type);
		this.name=name;
	}
	void info()
	{
		System.out.println("Industry type is :"+type);
		System.out.println("Industry name is :"+name);
	}
	public static void main(String[]args)
	{
		Abstract_ITConstructor a=new Abstract_ITConstructor("IT","Pharma");
		a.info();
	}
}
