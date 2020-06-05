package practice;
import java.io.*;
public class FileWrite {
	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		OutputStream o=null;
		o=new FileOutputStream("Akshay");
		
		String str="Hitesh Ashok Sonar";
		byte buffer[]=str.getBytes();
		o.write(buffer);
		o.close();
	}
}
