package cdac;
import java.util.*;

public class collque {

	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Goat");
		deque.add("Deer");
		deque.add("Wolf");
		deque.add("Lion");
		deque.add("Penguin");
		deque.remove();
		deque.remove();
		deque.poll();
		deque.poll();
		for(String str : deque)
		{
			System.out.println(str);
		}
		

	}

}
