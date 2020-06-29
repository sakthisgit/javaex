package cdac;
import java.util.*;

public class CollLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("Sai");
		al.add("Kiran");
		al.add("Kumaran");
		al.remove("Kumaran");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
