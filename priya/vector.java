import java.util.*;

public class VectorEg {
    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        vector.add("B");
        System.out.println(vector);
        vector.insertElementAt("C", 0);
        System.out.println("Insert C at 0 "+vector);
        vector.removeElementAt(vector.size()-1);
        System.out.println("Removing element at last "+vector);
        vector.removeElementAt(1);
	System.out.println(vector);
    }

}
