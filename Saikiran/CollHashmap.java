package cdac;
import java.util.*;
public class CollHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100, "Sai");
        map.put(101, "Kiran");
        map.put(102, "Ravi");
        map.put(103, "Gaurav");
        map.put(104, "Rahul");
        System.out.println("Initial list of elements:"+map);
        map.remove(100);
        System.out.println("Updated list of elements:"+map);
        map.remove(101);
        System.out.println("Updated list of elements:"+map);
        map.remove(102,"Ravi");
        System.out.println("Updated list of elements:"+map);
	}

}
