package practice;
abstract class Clg{
	abstract String name(String n);
}
public class AbstractClgname extends Clg{

	@Override
	String name(String n) {
		
		return n;
	}
	public static void main(String[]args)
	{
		AbstractClgname a=new AbstractClgname();
		System.out.println("name is :"+a.name("Hitesh"));
	}
	

}
