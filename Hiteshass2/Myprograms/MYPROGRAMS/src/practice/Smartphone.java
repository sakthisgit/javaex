package practice;
class Phone
{
	void calling()
	{
		System.out.println("only calling purpose use");
	}
	
}
class SmartPhone1 extends Phone
{
	void addfeature()
	{
		System.out.println("some features  add ");
	}
}
public class Smartphone {
	
	public static void main(String[]args)
	{
		SmartPhone1 s=new SmartPhone1();
		s.addfeature();
		s.calling();
	}
}
