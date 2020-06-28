import java.io.*;

public class FileCopyNoBuffer {  // Pre-JDK 7
   public static void main(String[] args) {
      String inFileStr = args[0];
      String outFileStr = args[1];
      FileInputStream in = null;
      FileOutputStream out = null;
      long startTime, elapsedTime;  // for speed benchmarking
 
      // Print file length
      File fileIn = new File(inFileStr);
      System.out.println("File size is " + fileIn.length() + " bytes");
 
      try {
         in = new FileInputStream(inFileStr);
         out = new FileOutputStream(outFileStr);
	
	 byte[] buffer = new byte[4096];

         startTime = System.nanoTime();
         int byteRead;
         // Read a raw byte, returns an int of 0 to 255.
         while ((byteRead = in.read(buffer)) != -1) {
            // Write the least-significant byte of int, drop the upper 3 bytes
            out.write(buffer,0,byteRead);
         }
         elapsedTime = System.nanoTime() - startTime;
         System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
      } catch (IOException ex) {
         ex.printStackTrace();
      } finally {  // always close the I/O streams
         try {
            if (in != null) in.close();
            if (out != null) out.close();
         } catch (IOException ex) {
            ex.printStackTrace();
         }
      }
   }
}
