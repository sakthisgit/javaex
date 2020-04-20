package practice;
import java.io.*;
public class Serilizableread {

	public static void main(String[]args) 
			throws FileNotFoundException,IOException, ClassNotFoundException
	{
		FileInputStream read=null;
		ObjectInputStream obj=null;
		read=new FileInputStream("Akshay");
		obj=new ObjectInputStream(read);

		Serilizableobject s=(Serilizableobject)obj.readObject();
//		Serilizableobject s=new Serilizableobject();
//		obj.readObject(s)
		System.out.println(s);


	}
}
