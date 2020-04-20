package practice;

public class Stringdemo {
	
	public static void main(String[]args)
	{
		String str="Coder";
		String str1="coder";
		String str2=new String("cOdEr");
		
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("str and str1 is same");
		}
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("str and str2 is same");
		}
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("str1 is same str2");
		}
	}
}
