import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

import jdk.jfr.events.FileReadEvent;

public class FileHandling {
    public static void main(String[] args)
    {
        File file = new File("Test1.txt");
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br =  new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null)
            System.out.println(line);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}