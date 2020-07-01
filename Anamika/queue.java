import java.util.*;
public class DequeEg {
    public static void main(String[] args)
    {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.add(100); 
        dq.add(200);
        System.out.println("Add command "+dq);
	System.out.println("===================================");
        dq.offer(300);
        System.out.println("Offer command "+dq);
	System.out.println("===================================");
        dq.push(400);
        System.out.println("Push command "+dq);
	System.out.println("===================================");
        dq.addFirst(500);
        System.out.println("AddFirst command "+dq);
	System.out.println("===================================");
        dq.push(600);
        System.out.println("Push commmand "+dq);
	System.out.println("===================================");
        dq.offerFirst(700);
        System.out.println("offerFirst command "+dq);
	System.out.println("===================================");
        System.out.println("Peek command to show first element "+dq.peek());
	System.out.println(dq);
	System.out.println("===================================");
        System.out.println("Peek last command to show last element "+dq.peekLast());
        System.out.println(dq);
	System.out.println("===================================");
        System.out.println("Remove command to remove first element "+dq.remove());
        System.out.println(dq);
	System.out.println("===================================");
        System.out.println("Remove last command to remove last element "+dq.removeLast());
        System.out.println(dq);
	System.out.println("===================================");
        System.out.println("Poll to remove command what we need to remove "+dq.poll());
        System.out.println(dq);
	System.out.println("===================================");
    }
}
