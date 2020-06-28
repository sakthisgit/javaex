import java.io.File;
import java.io.FilenameFilter;
public class filter{
   public static void main(String[] args) {
      File directory = new File("."); 
      if (directory.isDirectory()) {
         String[] files = directory.list(new FilenameFilter() 
		{
		            public boolean accept(File dir, String file) {
        		    return file.endsWith(".txt");
            	}
         });
         for (String file : files) {
            System.out.println(file);
         }
      }
   }
}
