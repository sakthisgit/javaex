package practice;
import java.io.*;
public class Fileread {
	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		InputStream in=null;
		in=new FileInputStream("hitesh.txt"); 
		int read=in.read();
		System.out.println(read);
		
		while(read!=-1)
		{
			read=in.read();
			if(read!=-1)
			{
				System.out.println((char)read);
			}
		}
		
	}
}
