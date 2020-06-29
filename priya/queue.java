import java.util.*;
public class DequeEg {
    public static void main(String[] args)
    {
        Deque<String> dq = new LinkedList<String>();
        dq.add("A"); 
        dq.add("B");
        System.out.println("Add command "+dq);
        dq.offer("C");
        System.out.println("Offer command "+dq);
        dq.push("D");
        System.out.println("Push command "+dq);
        dq.addFirst("E");
        System.out.println("AddFirst command "+dq);
        dq.push("F");
        System.out.println("Push commmand "+dq);
        dq.offerFirst("G");
        System.out.println("offerFirst command "+dq);
        System.out.println("Peek command to show first element "+dq.peek());
	System.out.println(dq);
        System.out.println("Peek last command to show last element "+dq.peekLast());
        System.out.println(dq);
        System.out.println("Remove command to remove first element "+dq.remove());
        System.out.println(dq);
        System.out.println("Remove last command to remove last element "+dq.removeLast());
        System.out.println(dq);
        System.out.println("Poll to remove command what we need to remove "+dq.poll());
        System.out.println(dq);
    }
}
