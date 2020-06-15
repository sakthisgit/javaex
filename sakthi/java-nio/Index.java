
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.GatheringByteChannel;

public class Index {
    public static void main(String params[]) {
        String data = "Example for Scattering and Gathering with Buffer Channel";
        gatherBytes(data);
        scatterBytes();
    }

    /*
     * gatherBytes() is used for reading the bytes from the buffers and write it to
     * a file channel.
     */
    public static void gatherBytes(String data) {
        // The First Buffer is used for holding a random number
        ByteBuffer buffer1 = ByteBuffer.allocate(8);
        // The Second Buffer is used for holding a data that we want to write
        ByteBuffer buffer2 = ByteBuffer.allocate(400);
        buffer1.asIntBuffer().put(1024);
        buffer2.asCharBuffer().put(data);
        
        // Write the data into file
        try {
            GatheringByteChannel gatherer = new FileOutputStream("testout.txt").getChannel();
            gatherer.write(new ByteBuffer[] { buffer1, buffer2 });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * scatterBytes() is used for reading the bytes from a file channel into a set
     * of buffers.
     */
    public static void scatterBytes() {
        // The First Buffer is used for holding a random number
        ByteBuffer buffer1 = ByteBuffer.allocate(8);
        // The Second Buffer is used for holding a data that we want to write
        ByteBuffer buffer2 = ByteBuffer.allocate(400);
        
        // Reading a data from the channel
        try {
            ScatteringByteChannel scatter = new FileInputStream("testout.txt").getChannel();
            scatter.read(new ByteBuffer[] { buffer1, buffer2 });
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Read the two buffers seperately
        buffer1.rewind();
        buffer2.rewind();

        int bufferOne = buffer1.asIntBuffer().get();
        String bufferTwo = buffer2.asCharBuffer().toString();
        // Verification of content
        System.out.println(bufferOne );
        System.out.println(bufferTwo);
    }

   
}
