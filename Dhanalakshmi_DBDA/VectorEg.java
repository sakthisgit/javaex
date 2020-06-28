import java.util.*;

public class VectorEg {
    public static void main(String[] args)
    {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(34);
        vec.add(100);
        System.out.println(vec);

        vec.insertElementAt(75, 0);
        System.out.println("Insert 75 at 0 "+vec);
        vec.removeElementAt(vec.size()-1);
        System.out.println("Removed element at last "+vec);
        vec.removeElementAt(3);       
    }

}