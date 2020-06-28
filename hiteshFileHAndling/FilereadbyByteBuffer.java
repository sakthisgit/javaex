package practice;
import java.io.*;
public class FilereadbyByteBuffer {
	
		public static void main(String[]args) throws FileNotFoundException,IOException
		{
			InputStream in=null;
			in=new FileInputStream("Akshay");
			
			System.out.println(in.available());
			int read=in.read();
			System.out.println(read);
			byte buffer[]=new byte[100];
			int data=in.read(buffer, 2, 8);
			for(int i=0;i<buffer.length;i++)
			{
				System.out.println((char)buffer[i]);
			}
			System.out.println(data);
		}

}
