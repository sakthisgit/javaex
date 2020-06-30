import java.util.*;
import java.io.*;

public class reverse
{
	public static void main(String []args)
	{
		int count=0; 
		String temp;
		String print[]=new String[5];
		try
		{
			File x=new File("reverse1.text");
			Scanner sc=new Scanner(x);
			temp=sc.nextLine();
			do
			{
				print[count]=temp;
				count++;
			}while((temp=sc.nextLine()) != null );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(print[i]);
		}
	}
}
