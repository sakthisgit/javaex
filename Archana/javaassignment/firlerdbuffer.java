import java.io.*;
public class Filerdbuffer{
	
		public static void main(String[]args) throws FileNotFoundException,IOException
		{
			InputStream in=null;
			in=new FileInputStream("demo1.txt");
			
			System.out.println(in.available());
			int read=in.read();
			System.out.println(read);
			byte buffer[]=new byte[100];
			int str=in.read(buffer, 5, 9);
			for(int i=0;i<buffer.length;i++)
			{
				System.out.println((char)buffer[i]);
			}
			System.out.println(str);
		}

}