import java.io.*;

public class CharIO{


	public static void main(String[] args){
	
	
	FileReader fr =null;
	FileWriter fo =null;	
	try{
	
		fr = new FileReader(args[0]);
		fo = new FileWriter(args[1]);
		int t;
		while( (t=fr.read()) != -1){
			fo.write(t);
		}	
	
	
	}catch(Exception e){
	
		System.out.println(e);
	}finally{
	
		try{
		fr.close();
		fo.close();
		}catch(Exception e){}
	}
	
	
	
	}


}
