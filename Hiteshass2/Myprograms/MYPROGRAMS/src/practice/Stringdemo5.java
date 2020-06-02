package practice;

public class Stringdemo5 {
	
	public static void main(String[]args)
	{
		String str="Hiteshhhh";
		System.out.println(str.indexOf("Hiteshhhh"));
		
		String str1="Ashokkkkk";
		System.out.println(str1.lastIndexOf('k'));
		
		String str2="Sonarrrrr";
		System.out.println(str2.indexOf('r', 5));
		
		String str3="java is very good";
		boolean result=str3.startsWith("ava");
		System.out.println(result);
		
		boolean result1=str3.endsWith("good");
		System.out.println(result1);
	}
}
