package practice;
import java.io.*;
public class FilEWriter {
	
	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		Writer w=null;
		w=new FileWriter("Akshay");
		
		String str="Akshay is very sweet and goodest Porga";
		byte buffer[]=str.getBytes();
//		w.write(buffer);
//		w.write(66);
//		w.write(cbuf);
//		//
		//We can not write using writer abstract class
//		
	}
}
