package practice;
import java.io.*;
import java.util.Scanner;
public class SerilizableWrite {
	
	public static void main(String[]args) throws FileNotFoundException,IOException
	{
		FileOutputStream out=null;
		ObjectOutputStream obj=null;
		out=new FileOutputStream("Akshay");
		obj=new ObjectOutputStream(out);
		
		System.out.println("Enter the values of all info");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id here");
		int id=sc.nextInt();
		System.out.println("Enter the name here");
		String name=sc.next();
		System.out.println("Enter the Mailid here");
		String mail=sc.next();
		System.out.println("Enter the pwd");
		String pwd=sc.next();
		
		Serilizableobject s=new Serilizableobject();
		s.setId(id);
		s.setName(name);
		s.setMail(mail);
		s.setPwd(pwd);
		
		obj.writeObject(s);
		System.out.println("Write Succesfully in akshay file ");
	}

}
