package practice;

public class Stringdemo8 {
	public static void main(String[]args)
	{
		String str="Hitesh Sonar";
		String rev=" ";
		//for(int i=0;i<str.length();i++)
		for(int i=str.length()-1;i>0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
