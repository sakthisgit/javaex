package cdac;
import java.util.*;

public class CollStack {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Akshay");
		stack.push("Pradeep");
		stack.push("Rio");
		stack.push("Garima");
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
