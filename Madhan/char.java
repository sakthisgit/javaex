import java.util.*;
import java.io.*;

public class reverse
{
	public static void main(String []args)
	{
		int count=0; 
		String temp;
		char print[]=new char[50];
		try
		{
			File x=new File("char.text");
			Scanner sc=new Scanner(x);
			temp=sc.nextLine();
			do
			{
				while(temp.charAt(count)!=0)
				{
					System.out.println(temp.charAt(count));
					print[count]=temp.charAt(count);
					count++;
				}
			}while((temp=sc.nextLine()) != null );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(print[i]);
		}
	}
}
