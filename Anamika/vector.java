import java.util.*;

public class VectorEg {
    public static void main(String[] args)
    {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(100);
        vector.add(200);
        System.out.println(vector);
        vector.insertElementAt(50, 0);
        System.out.println("Insert 50 at 0 "+vector);
        vector.removeElementAt(vector.size()-1);
        System.out.println("Removing element at last "+vector);
        vector.removeElementAt(1);
	System.out.println(vector);
    }

}
