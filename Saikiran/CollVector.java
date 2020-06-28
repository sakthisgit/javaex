package cdac;
import java.util.*;
public class CollVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Sai");
		v.add("Kiran");
		v.add("Ashish");
		v.add("Ravi");
		v.add("Krishna");
		v.remove(0);
		v.remove(1);
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
