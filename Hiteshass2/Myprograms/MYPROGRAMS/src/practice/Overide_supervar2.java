package practice;
class Add{
	public int calc(int a,int b)
	{
		return a+b;
	}
}
class Calculation extends Add{
	public int calc(int x,int y)
	{	
		System.out.println("Parent add class :"+super.calc(25, 45));
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
}
public class Overide_supervar2 {
	public static void main(String[]args)
	{
		Calculation c=new Calculation();
		System.out.println("Second class :"+c.calc(88, 11));
		System.out.println("Second class :"+c.sub(5, 2));
		
	}
}
