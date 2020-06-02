package practice;
import java.io.*;

public class FileReader09 {

	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		Reader r=null;
		r=new FileReader("Akshay");

		System.out.println(r.read());
		int read=r.read();
		while(read!=-1)
		{
			read=r.read();
			if(read!=-1)
			{
				System.out.println((char)read);
			}
		}
		System.out.println("File Read Succesfully");
	}

}
