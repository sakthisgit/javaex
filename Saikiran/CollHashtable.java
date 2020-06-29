package cdac;
import java.util.*;
public class CollHashtable {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(100,"Sai");
        map.put(101, "Kiran");
        map.put(102, "Ravi");
        map.put(103, "Gaurav");
        map.put(104, "Rahul");
        System.out.println("Before remove:"+map);
        map.remove(102);
        System.out.println("After remove:"+map);

	}

}
