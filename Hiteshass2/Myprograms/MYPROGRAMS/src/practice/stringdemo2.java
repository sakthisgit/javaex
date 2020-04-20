package practice;

public class stringdemo2 {
	
	public static void main(String[]args)
	{
		String str="Coder";
		String str1="Coder";
		String str2=new String("coder");
		
		if(str.equals(str1))
		{
			System.out.println("str and str1 is same");
		}
		if(str1.equals(str2))
		{
			System.out.println("str1 is same str2");
		}
	}
}
