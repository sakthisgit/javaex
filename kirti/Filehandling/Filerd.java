import java.io.*;

public class Filerd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("info.txt");
		FileReader fr = new FileReader(f);
         	BufferedReader br = new BufferedReader(fr);
		String str ="";
		while((str=br.readLine())!=null)
{
			System.out.println(str);
		}
		
	}

}
