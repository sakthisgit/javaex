import java.util.*;
public class queueimplement
{
    public static void main(String[] args)
    {
	Deque<String> deque = new ArrayDeque<>();

        deque.add("kirti");
        deque.add("vibha");
	deque.add("amu");
	deque.addLast("aditi");
	System.out.println(deque);
        deque.addFirst("kedar");
	System.out.println(deque);
	deque.remove();
        System.out.println(deque);
	deque.removeLast();
        System.out.println(deque);
	deque.removeFirst();
        System.out.println(deque);
        deque.add("aditya");
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
