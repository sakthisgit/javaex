import java.io.*;
public class copyfile{

	public static void main(String[]args) 
	{
		try
		{
			InputStream in=null;
			in=new FileInputStream("demo1.txt");
			OutputStream out=null;
			out=new FileOutputStream("copy.txt");

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
			System.out.println("Data Succesfully copied ");

		}catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

}


