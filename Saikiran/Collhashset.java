package cdac;
import java.util.*;
public class Collhashset {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<String>();
        set.add("Ravi");
        set.add("Kiran");
        set.add("Praveen");
        set.add("Ajay");
        set.add("Ravi");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
