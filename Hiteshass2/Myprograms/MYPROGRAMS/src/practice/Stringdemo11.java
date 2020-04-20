package practice;

public class Stringdemo11 {
	
	public static void main(String[]args)
	{
		String str="Hitesh Ashok Sonar";
		char ch[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(ch[i]==str.charAt(j))
				{
					System.out.println(str.charAt(j));
				}
			}
		}
	}
}
