package practice;
import java.io.*;
import java.util.Scanner;
public class FileOutputAkshay {


	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		OutputStream out=null;
		out=new FileOutputStream ("Akshay");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to put in that Akshay File");
		String str;
		str=sc.next();
		System.out.println(str);
		byte buffer[]=str.getBytes();
		out.write(buffer);
		out.write(88);
		out.write(buffer, 5, 9);
		System.out.println("String write in file successfully");
		out.close();

	}
}
