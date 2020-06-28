package practice;

public class Typecasting {
	public static void main(String[]args)
	{
	byte a=20;
	System.out.println("Byte A :"+a);
	System.out.println("Implicit type casting into Double");
	double d=a;
	System.out.println("Double d :"+d);
	
	
	long b=123645;
	System.out.println("Long l :"+b);
	System.out.println("Explicit type casting");
	int v=(int)b;
	System.out.println("int v :"+v);
}
}
