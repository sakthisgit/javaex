package practice;
import java.io.*;
public class FileCopy {

	public static void main(String[]args) 
	{
		try
		{
			InputStream in=null;
			in=new FileInputStream("Akshay");
			OutputStream out=null;
			out=new FileOutputStream("hitesh.txt");

			int read=in.read();
			while(read!=-1)
			{
				read=in.read();
				if(read!=-1)
				{
					out.write(read);
				}
			}
			System.out.println(read);
			System.out.println("Data Succesfully read and Write ");

		}catch(FileNotFoundException f)
		{
			System.out.println(f);
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
//		finally {
//			try {
//				out.close();
//			}
//			catch(IOException p)
//			{
//				System.out.println(p);
//			}
//		}
	}

}
