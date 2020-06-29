package cdac;
import java.util.*;
public class CollTree {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Paul");
		set.add("Troy");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
       
        }
	}

}
