package practice;
import java.io.*;
public class PrintWriterdemo {
	
	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		File f=new File("Akshay");
		PrintWriter p=null;
		p=new PrintWriter (f);
		
		String s="Hello hi ks kay ";
		System.out.println("print0");
		p.println(s);
		System.out.println("flush");
		p.flush();
		System.out.println("print0");
		p.append(s);
		System.out.println("flush");
		p.flush();
		System.out.println("print0");
		p.append("YES i am here");
		System.out.println("flush");
		p.flush();
		p.close();
		
	}
}
