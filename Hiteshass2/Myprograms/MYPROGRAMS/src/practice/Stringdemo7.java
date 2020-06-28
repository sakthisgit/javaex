package practice;

public class Stringdemo7 {
	public static void main(String[]args)
	{
		String str1="Hiteshsonar";
		char ch[]=str1.toCharArray();

		for(int i=ch.length-1;i>0;i--)
		{
			System.out.println(ch[i]);
		}
	}
}
