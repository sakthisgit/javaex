package practice;

public class Stringdemo10 {
	//hiteshsonar00@gmail.com
	//yath @ paryanth print karaych
	public static void main(String[]args)
	{
		String str="hiteshsonar00@gmail.com";
		String add="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='@')
			{
				break;
			}
			else
			{
				add=add+str.charAt(i);
			}
			
		}
		System.out.println(add);
	}
}
