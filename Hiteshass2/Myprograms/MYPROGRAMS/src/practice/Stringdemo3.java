package practice;

public class Stringdemo3 {
	public static void main(String[]args)
	{
		char ch[]= {'j','a','v','a'};
		String str=new String(ch);
		
		System.out.println(str);
		if(str.equals(ch))
		{
			System.out.println("str and ch is same");
		}
		String str1="Hitesh";
		String str2="Hitesh";
		{
			System.out.println("Hitesh".equals(str1));
		}
		int len=str1.length();
		System.out.println(len);
	}
}
