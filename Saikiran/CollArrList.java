package cdac;
import java.util.*;

public class CollArrList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sai");
		list.add("Kiran");
		list.add("Kumaran");
		list.add("Roy");
		list.remove("Roy");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
