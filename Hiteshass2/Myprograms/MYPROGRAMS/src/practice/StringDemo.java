package practice;

public class StringDemo {
	
	public static void main(String[]args)
	{
		String str="Coder";
		String str1="Coder";
		String str2=new String("Coder");
		String str3=new String("coder");
		
		
		if(str==str1)
		{
			System.out.println("str or str1 is same");
		}
		if(str2==str1)
		{
			System.out.println("str2 and str1 is same");
		}
		if(str3==str2)
		{
			System.out.println("str3 and str2 is same");
		}
	}
}
