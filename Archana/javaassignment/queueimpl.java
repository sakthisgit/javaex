import java.util.*;
public class queueimpl
{
    public static void main(String[] args)
    {
	Deque<String> deque = new ArrayDeque<>();

        deque.add("pooja");
        deque.add("sonu");
	deque.add("jeet");
	deque.addLast("aditi");
	System.out.println(deque);
        deque.addFirst("aditya");
	System.out.println(deque);
	deque.remove();
        System.out.println(deque);
	deque.removeLast();
        System.out.println(deque);
	deque.removeFirst();
        System.out.println(deque);
        deque.add("adi");
        deque.add("pari");
	deque.add("mughdha");
	deque.addLast("swara");
        System.out.println(deque);
	deque.poll();
	System.out.println(deque);
	deque.pollFirst();
	System.out.println(deque);
	deque.pollLast();
	System.out.println(deque);
	
}
}
