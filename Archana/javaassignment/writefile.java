import java.io.*;

public class FileWrite {

	public static void main(String[] args) throws Exception 
	{
	
       File f = new File("info.txt");
       FileWriter fw = new FileWriter(f,true);
       PrintWriter out = new PrintWriter(fw);
       
       out.println("Welcome");
       out.println(101);
       out.close();
       
       
	}

}