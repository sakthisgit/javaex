package practice;

public class Stringdemo13 {
	public static void main(String[]args)
	{
		String str="Hitesh";
		String str1="hitesh";
		
		System.out.println(str.compareTo(str1));
		
		if(str.compareTo(str1)<0)
		{
			System.out.println("str1 is bigger than str");
		}

		if(str.compareTo(str1)>0)
		{
			System.out.println("str is bigger than str1");
		}

		if(str.compareTo(str1)==0)
		{
			System.out.println("str1 is same str");
		}
	}
}
